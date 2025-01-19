
package utilites;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class CardNumberFilter extends DocumentFilter {
    private static final int MAX_LENGTH = 19; 

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string != null) {
            StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
            currentText.insert(offset, string);
            String formattedText = formatCardNumber(currentText.toString());
            if (formattedText.length() <= MAX_LENGTH) {
                fb.remove(0, fb.getDocument().getLength());
                super.insertString(fb, 0, formattedText, attr);
            }
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
        StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        currentText.replace(offset, offset + length, string != null ? string : "");
        String formattedText = formatCardNumber(currentText.toString());
        if (formattedText.length() <= MAX_LENGTH) {
            fb.remove(0, fb.getDocument().getLength());
            super.insertString(fb, 0, formattedText, attr);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        currentText.delete(offset, offset + length);
        String formattedText = formatCardNumber(currentText.toString());
        fb.remove(0, fb.getDocument().getLength());
        super.insertString(fb, 0, formattedText, null);
    }

    // Metoda za formatiranje unosa broja kartice
    private String formatCardNumber(String text) {
        text = text.replaceAll("[^\\d]", ""); // Uklanjamo sve osim cifara
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                formatted.append("-"); // Dodajemo crticu nakon svake 4 cifre
            }
            formatted.append(text.charAt(i));
        }
        return formatted.toString();
    }
}

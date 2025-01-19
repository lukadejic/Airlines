
package utilites;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class ExpiryDateFilter extends DocumentFilter {
    private static final int MAX_LENGTH = 5; // Maksimalna dužina (MM/YY)

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string != null) {
            StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
            currentText.insert(offset, string);
            String formattedText = formatExpiryDate(currentText.toString());
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
        String formattedText = formatExpiryDate(currentText.toString());
        if (formattedText.length() <= MAX_LENGTH) {
            fb.remove(0, fb.getDocument().getLength());
            super.insertString(fb, 0, formattedText, attr);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        currentText.delete(offset, offset + length);
        String formattedText = formatExpiryDate(currentText.toString());
        fb.remove(0, fb.getDocument().getLength());
        super.insertString(fb, 0, formattedText, null);
    }

    // Metoda za formatiranje unosa datuma isteka
    private String formatExpiryDate(String text) {
        text = text.replaceAll("[^\\d]", ""); // Uklanjamo sve osim cifara
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i == 2) { // Dodajemo '/' nakon dve cifre
                formatted.append("/");
            }
            formatted.append(text.charAt(i));
        }
        return formatted.toString();
    }
}

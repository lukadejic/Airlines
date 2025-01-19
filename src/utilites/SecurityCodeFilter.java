
package utilites;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class SecurityCodeFilter extends DocumentFilter {
    private static final int MAX_LENGTH = 4; // Maksimalna dužina (3 ili 4 cifre)

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string != null) {
            StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
            currentText.insert(offset, string);
            String filteredText = filterDigits(currentText.toString());
            if (filteredText.length() <= MAX_LENGTH) {
                fb.remove(0, fb.getDocument().getLength());
                super.insertString(fb, 0, filteredText, attr);
            }
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
        StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        currentText.replace(offset, offset + length, string != null ? string : "");
        String filteredText = filterDigits(currentText.toString());
        if (filteredText.length() <= MAX_LENGTH) {
            fb.remove(0, fb.getDocument().getLength());
            super.insertString(fb, 0, filteredText, attr);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        StringBuilder currentText = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        currentText.delete(offset, offset + length);
        fb.remove(0, fb.getDocument().getLength());
        super.insertString(fb, 0, currentText.toString(), null);
    }

    private String filterDigits(String text) {
        return text.replaceAll("[^\\d]", "");
    }
}

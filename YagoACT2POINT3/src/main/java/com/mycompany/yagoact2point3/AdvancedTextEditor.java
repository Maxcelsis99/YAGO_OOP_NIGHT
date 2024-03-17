
package com.mycompany.yagoact2point3;

public class AdvancedTextEditor extends TextEditor {

    public AdvancedTextEditor(String initialText) {
        super(initialText);
    }

    private String previousText;

    public void undo() {
        setText(previousText);
    }

    @Override
    public void append(String newText) {
        previousText = getText();
        super.append(newText);
    }

    @Override
    public void delete(int n) {
        previousText = getText();
        super.delete(n);
    }
}

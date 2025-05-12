/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class RestrictedDocument extends PlainDocument {
    private String[] input;

    public RestrictedDocument(String[] input) {
        this.input = input;
    }
    public boolean validate(String exp) {
        int len = input.length;
        for(int i=0; i<len; i++) {
            if (exp.equals(input[i]))
                return true;
        }
        return false;
    }
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null || !validate(str)) {
            return;
        }
        super.insertString(offs, str, a);
    }
}

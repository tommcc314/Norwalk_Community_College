/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.JTextField;
import javax.swing.text.Document;

public class JDecimalTextField extends JTextField {
    public JDecimalTextField() {
        super();
    }
    @Override
    protected Document createDefaultModel() {
        String[] acceptedInput = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "-"};
        return new RestrictedDocument(acceptedInput);
    }
}

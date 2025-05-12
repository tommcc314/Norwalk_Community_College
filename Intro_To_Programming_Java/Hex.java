/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10;
import javax.swing.JOptionPane;
public class Hex {
  public static void main(String[] args) {
    String s1 = JOptionPane.showInputDialog(null, "Enter a hex value: ");
    int hexToDecimal = Integer.parseInt(s1, 16);
    JOptionPane.showMessageDialog(null, "Hexadecimal " + s1 + " = Decimal " + hexToDecimal);
  }
}
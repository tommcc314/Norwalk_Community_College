/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10;
import javax.swing.JOptionPane;
public class Split {
  public static void main(String[] args) {
    String s1 = JOptionPane.showInputDialog(null, "Enter an address. Separate each line with a percent sign:");
    String[] split = s1.split("%");
    String display = "";
    for (int i = 0; i < split.length; i++) {
      display+= split[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, display);
  }
}
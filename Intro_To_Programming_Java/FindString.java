/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10;
import javax.swing.JOptionPane;
public class FindString {
  public static void main(String[] args) {
    String s1 = JOptionPane.showInputDialog(null, "Enter a string to search: ");
    String searchString = JOptionPane.showInputDialog(null, "Now, enter a search string:");
    int index = s1.indexOf(searchString) + 1;
    if (index == 0) {
      JOptionPane.showMessageDialog(null, "Search string not found");
    }
    else {
      JOptionPane.showMessageDialog(null, searchString + " was found at position " + index);
    }
  }
}

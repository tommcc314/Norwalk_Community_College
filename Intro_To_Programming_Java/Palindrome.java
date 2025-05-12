/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10;
import javax.swing.JOptionPane;
public class Palindrome {
  public static void main(String[] args) {
    String s1 = JOptionPane.showInputDialog(null, "Enter a palindrome:");
    StringBuilder stringBuilder = new StringBuilder(s1);
    stringBuilder.reverse();
    String s2 = stringBuilder.toString();
    boolean isPalindrome = s2.equalsIgnoreCase(s1);
    if (isPalindrome == true) {
      JOptionPane.showMessageDialog(null, s1 + " is a palindrome.");
    }
    else {
      JOptionPane.showMessageDialog(null, s1 + " isn't a palindrome.");
    }
  }
}
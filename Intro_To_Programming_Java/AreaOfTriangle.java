/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class AreaOfTriangle {
  public static void main(String[] args) {
    String input1 = JOptionPane.showInputDialog(null, "Enter the lengths of the sides of a triangle:");
    StringTokenizer st1 = new StringTokenizer(input1, " ");
    double a = Double.parseDouble(st1.nextToken());
    double b = Double.parseDouble(st1.nextToken());
    double c = Double.parseDouble(st1.nextToken());
    double p = (a + b + c) / 2;
    String area = "The area of the triangle is " + 
        (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    if (a + b <= c || a + c <= b || b + c <= a) {
      JOptionPane.showMessageDialog(null, "Invalid Triangle");
    }
    else {
      JOptionPane.showMessageDialog(null, area);
    }
  }
}
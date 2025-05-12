/*
 * Program Name:          Lab01 – Approximating PI 
 * Program Description:   This program displays my initials and 
 *                        calculates an approximation of π using the 
 *                        following formula: 
 *                        π  =  4 * [1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + 1/13]  
 * Program Author:        Tom McCarthy
 * Date Created:          06/07/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab01;
import javax.swing.JOptionPane;
public class Lab01 {
  public static void main(String[] args) {
      
    //Print initials
      
    System.out.println("TTTTTTT       M       M");
    System.out.println("   T          MM     MM");
    System.out.println("   T          M M   M M");
    System.out.println("   T          M  M M  M");
    System.out.println("   T          M   M   M");
    
    //Welcome
    
    System.out.println("Welcome to CSC108.");
    
    //Approximation of pi
    
    System.out.println("Tom McCarthy's approximation of \u03C0 is: \n " + 
    (4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13)));
    
    //Show pi in message
   
    JOptionPane.showMessageDialog(null, "Tom McCarthy's approximation of \u03C0 is: \n " + 
    (4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13)));
  }
}

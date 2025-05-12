/*
 * Program Name:            TestQuadraticEquation
 * Program Description:     This program displays the roots of a quadratic 
 *                          equation with coefficients specified by the user 
 *                          and displays the current time.
 *                           
 * Program Author:          Tom McCarthy
 * Date Created:            07/19/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab09;
import java.util.Scanner;
public class TestQuadraticEquation {
  public static void main(String[] args) {
      
    //make quadratic equation
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three coefficients:");
    int coeffA = input.nextInt();
    int coeffB = input.nextInt();
    int coeffC = input.nextInt();
    QuadraticEquation quadraticEquation = new QuadraticEquation(coeffA,coeffB,coeffC);
    
    //call methods for results
    System.out.println("For: " + quadraticEquation.getA() + "x\u00B2 + " + 
      quadraticEquation.getB() + "x + " + quadraticEquation.getC() + " = 0");
    double discriminant = quadraticEquation.getDiscriminant();
    if (discriminant < 0) {
      System.out.println("No roots");
    }
    else if (discriminant == 0) {
      System.out.println("Root is " + quadraticEquation.getRoot1());
    }
    else {
      System.out.println("Roots are " + quadraticEquation.getRoot1() + " and " +
        quadraticEquation.getRoot2());
    }
    java.util.Date date = new java.util.Date();
    System.out.println(date.toString());
  }
}
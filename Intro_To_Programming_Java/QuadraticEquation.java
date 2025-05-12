/*
 * Program Name:            QuadraticEquation
 * Program Description:     This program contains methods to calculate the 
 *                          coefficients, discriminant and roots of a 
 *                          quadratic equation.
 *                           
 * Program Author:          Tom McCarthy
 * Date Created:            07/19/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab09;
public class QuadraticEquation {
  private static int coeffA;
  private static int coeffB;
  private static int coeffC;
  QuadraticEquation(int newA, int newB, int newC) {
    coeffA = newA;
    coeffB = newB;
    coeffC = newC;
  }
  public int getA() {
    return coeffA;
  }
  public int getB() {
    return coeffB;
  }
  public int getC() {
    return coeffC;
  }
  public double getDiscriminant() {
    return (coeffB * coeffB) - (4 * coeffA * coeffC);
  }
  public double getRoot1() {
    return ((-coeffB + Math.sqrt(Math.pow(coeffB, 2)-(4* coeffA * coeffC)))/2);
  }
  public double getRoot2() {
    return ((-coeffB - Math.sqrt(Math.pow(coeffB, 2)-(4* coeffA* coeffC)))/2);
  }
}
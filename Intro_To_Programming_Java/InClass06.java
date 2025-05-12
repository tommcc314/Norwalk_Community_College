/*
 * Program Name:            InClass06
 * Program Description:     This program uses methods to display characteristics
 *                          of two numbers. (min, max, sum, etc.)
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/03/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass06;
import java.util.Scanner;
public class InClass06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    
    //Call methods to display results
    System.out.println("The minimum of " + number1 + " and " + number2 + 
      " is " + min(number1, number2));
    System.out.println("The maximum of " + number1 + " and " + number2 + 
      " is " + max(number1, number2));
    System.out.println("The sum of " + number1 + " and " + number2 + 
      " is " + sum(number1, number2));
    System.out.println("The difference of " + number1 + " and " + number2 + 
      ", rounded to the nearest whole integer, is " + 
      difference(number1, number2));
    System.out.println("The product of " + number1 + " and " + number2 + 
      " is " + product(number1, number2));
  }
  
  //define methods
  public static double min(double number1, double number2) {
    if (number1 > number2)
      return number2;
    else
      return number1;
  }
  public static double max(double number1, double number2) {
    if (number1 > number2)
      return number1;
    else
      return number2;
  }
  public static double sum(double number1, double number2) {
    return (number1 + number2);
  }
  public static int difference(double number1, double number2) {
    return (int)(Math.round(Math.abs(number1 - number2)));
  }
  public static double product(double number1, double number2) {
    return (number1 * number2);
  }
}
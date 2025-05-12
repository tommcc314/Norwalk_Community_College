/*
 * Program Name:            InClass06A
 * Program Description:     This program uses methods to display characteristics
 *                          of two decimals and two integers 
 *                          (min, max, sum, etc.), and displays
 *                          whether they are positive or negative.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/03/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass06a;
import java.util.Scanner;
public class InClass06A {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    System.out.print("Enter two decimals: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    System.out.print("Enter two integers: ");
    int int1 = input.nextInt();
    int int2 = input.nextInt();
    
    //Call methods to display results
    System.out.println("The minimum of " + number1 + " and " + number2 + 
      " is " + sign(min(number1, number2)) + min(number1, number2));
    System.out.println("The maximum of " + number1 + " and " + number2 + 
      " is " + sign(max(number1, number2)) + max(number1, number2));
    System.out.println("The sum of " + number1 + " and " + number2 + 
      " is " + sign(sum(number1, number2)) + sum(number1, number2));
    System.out.println("The difference between " + number1 + " and " + number2 + 
      ", rounded to the nearest whole integer, is " + 
      sign(difference(number1, number2)) + difference(number1, number2));
    System.out.println("The product of " + number1 + " and " + number2 + 
      " is " + sign(product(number1, number2)) + product(number1, number2));
    System.out.println("The minimum of " + int1 + " and " + int2 + " is " +
      sign(min(int1, int2)) + min(int1, int2));
    System.out.println("The maximum of " + int1 + " and " + int2 + " is " +
      sign(max(int1, int2)) + max(int1, int2));
    System.out.println("The sum of " + int1 + " and " + int2 + " is " +
      sign(sum(int1, int2)) + sum(int1, int2));
    System.out.println("The difference between " + int1 + " and " + int2 + 
      " is " + sign(difference(int1, int2)) + difference(int1, int2));
    System.out.println("The product of " + int1 + " and " + int2 + " is " +
      sign(product(int1, int2)) + product(int1, int2));
  }
  
  //define methods
  public static int min(int number1, int number2) {
    if (number1 > number2)
      return number2;
    else
      return number1;
  }
  public static double min(double number1, double number2) {
    if (number1 > number2)
      return number2;
    else
      return number1;
  }
  public static int max(int number1, int number2) {
    if (number1 > number2)
      return number1;
    else
      return number2;
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
   public static int sum(int number1, int number2) {
    return (number1 + number2);
  }
  public static int difference(double number1, double number2) {
    return (int)(Math.round(Math.abs(number1 - number2)));
  }
  public static int difference(int number1, int number2) {
    return Math.abs(number1 - number2);
  }
  public static double product(double number1, double number2) {
    return (number1 * number2);
  }
  public static int product(int number1, int number2) {
    return (number1 * number2);
  }
  public static String sign(int number) {
    if (number < 0)
      return "negative: ";
    else if (number == 0)
      return "neutral: ";
    else
      return "positive: ";
  }
  public static String sign(double number) {
    if (number < 0)
      return "negative: ";
    else if (number == 0)
      return "neutral: ";
    else
      return "positive: ";
  }
}
/*
 * Program Name:             InClass04
 * Program Description:      This program performs several tasks from the math,
 *                           char, and string class.
 * Program Author:           Tom McCarthy
 * Date Created:             06/19/2018
 *
 * Change#        Change Date         Programmer Name         Description
 * -------        -----------         ---------------         -----------
 */
package inclass04;
import java.util.Scanner;
public class InClass04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //day of the week
    System.out.print("Please enter an integer for the day of the week (0-6): ");
    int day = input.nextInt();
    switch (day) {
      case 0: System.out.println(day + " is Sunday"); break;
      case 1: System.out.println(day + " is Monday"); break;
      case 2: System.out.println(day + " is Tuesday"); break;
      case 3: System.out.println(day + " is Wednesday"); break;
      case 4: System.out.println(day + " is Thursday"); break;
      case 5: System.out.println(day + " is Friday"); break;
      case 6: System.out.println(day + " is Saturday"); break;
    }
    //min and max
    System.out.println("\nPlease enter two numbers for max and min: ");
    double max = input.nextDouble();
    double min = input.nextDouble();
    if (min > max) {
      double temp = min;
      min = max;
      max = temp;
    }
    System.out.println("The minimum is " + min + " and the maximum is " + max);
    //squareroot
    System.out.println("\nPlease enter a number to be square-rooted: ");
    double squareRoot = input.nextDouble();
    System.out.println("The square root of " + squareRoot + " is " + 
      (Math.sqrt(squareRoot)));
    //power
    System.out.println("\nPlease enter a base: ");
    double base = input.nextDouble();
    System.out.println("Please enter a power: ");
    double power = input.nextDouble();
    System.out.println("The base " + base + " raised to the power of " + power + 
      " , rounded to the nearest whole number, is " + 
        (int)(Math.round(Math.pow(base, power))));
    //letter value
    System.out.println("\nPlease enter an integer between 1 and 26: ");
    int letter = input.nextInt();
    char characterValue = (char)(int)('a' + (letter - 1));
    System.out.println("Letter " + letter + " is: " + characterValue);
    //lowercase to uppercase
    System.out.println("\nPlease enter a lowercase character: ");
    char lowerCase = input.next().charAt(0);
    System.out.println("Letter in uppercase is " + 
      (Character.toUpperCase(lowerCase)));
    //quote
    System.out.println("\nPlease enter your last name:");
    String lastName = input.next();
    System.out.println("Please enter an adjective for Java");
    String adjective = input.next();
    System.out.println("Here's my quote:");
    System.out.println("\t\"Programming is \'" + adjective + "\' for those " +
      "who work hard.\" - " + lastName + " \u263A");                
  }                                                                        
}                                                                                                                      
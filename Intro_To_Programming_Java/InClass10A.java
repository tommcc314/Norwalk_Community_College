/*
 * Program Name:            InClass10A
 * Program Description:     This program uses regular expressions to validate 
 *                          user input (telephone number, social security number
 *                          and taxpayer ID.)
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/25/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass10a;
import java.util.Scanner;
public class InClass10A {
  public static void main(String[] args) {
    System.out.println("Enter a phone number, Social Security Number, or Taxpayer ID number: ");
    Scanner input = new Scanner(System.in);
    String userInput = input.next();
    if (userInput.matches("\\d{3}-\\d{3}-\\d{4}") == true) {
      if (userInput.matches("203.*") || userInput.matches("860.*") || userInput.matches("959.*"))
        System.out.println("The string " + userInput + 
        " is a phone number in CT");
      else
      System.out.println("The string " + userInput + " is a phone number");
    }
    else if (userInput.matches("\\d{3}-\\d{2}-\\d{4}")) {
      System.out.println("The string " + userInput + 
      " is a social security number");
    }
    else if (userInput.matches("\\d{2}-\\d{7}")){
      System.out.println("The string " + userInput + " is a Taxpayer ID number");
    }
  }
}
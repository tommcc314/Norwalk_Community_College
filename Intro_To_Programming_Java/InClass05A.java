/*
 * Program Name:            InClass05A
 * Program Description:     This program will display a certain number of rows 
 *                          and numbers based on the user's specification.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            06/27/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass05a;
import java.util.Scanner;
public class InClass05A {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer between 1 and 9, inclusive: ");
    int rowCount = input.nextInt();
    
    //Error message
    while (rowCount < 1 || rowCount > 9) {
      System.out.println("Incorrect. Enter an integer between 1 and 9, inclusive: ");
      rowCount = input.nextInt();
    }
    int rowNumber = 1;
    int numCount = 0;
    int numSum = 0;
    
    //print numbers
    for (; rowNumber <= rowCount; rowNumber++) {
      for (int numbersPerRow = 2; numbersPerRow <= rowNumber; numbersPerRow++) {
        System.out.print(rowNumber);
        numSum += rowNumber;
      }
    System.out.println(rowNumber);
    numCount += rowNumber;
    numSum += rowNumber;
    }
    
    //print number and sum of integers
    System.out.println("The total number of integers written: " + 
      numCount);
    System.out.println("The total sum of all integers: " + numSum);
  }
}
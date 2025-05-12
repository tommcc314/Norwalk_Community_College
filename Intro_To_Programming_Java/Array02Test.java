/*
 * Program Name:            Array02Test
 * Program Description:     This program asks the user for the length of the 
 *                          array, has the user input integers in the array, 
 *                          and displays square roots and the median. 
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/11/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass07a;
import java.util.Scanner;
public class Array02Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Get input for array
    System.out.print("Enter the amount of numbers in the array: ");
    int numListMax = input.nextInt();
    int numListLength = 0;
    int[] numList = new int[numListMax];
    for (int i = 0; i < numListMax; i++) {
      System.out.print("Enter a number, or 999 to exit: ");
      numList[i] = input.nextInt();
      if (numList[i] == 999) {
        numListLength = i;
        break;
      }
      numListLength = i + 1;
    }
    
    //Display data
    System.out.println("The numbers entered are: ");
    for(int i = 0; i < numListLength; i++) {
      System.out.println(numList[i] + " and its square root is " + 
        (Math.sqrt(numList[i])));
    }
    if (numListLength % 2 == 1) {
      System.out.println("The median is: " + numList[numListLength / 2]);
    }
    else {
      double medianAverage = ((numList[numListLength / 2 - 1] + 
        numList[numListLength / 2]) / 2.0);
      System.out.println("The median is: " + medianAverage);
    }
  }
}
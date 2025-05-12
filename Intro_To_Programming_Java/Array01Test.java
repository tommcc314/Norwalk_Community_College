/*
 * Program Name:            Array01Test
 * Program Description:     This program asks the user for the length of the 
 *                          array, has the user input integers in the array, 
 *                          and performs calculations (squares) and reversals on
 *                          the integers in the array.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/11/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass07a;
import java.util.Scanner;
public class Array01Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Get input for array
    System.out.print("Enter the amount of numbers in the array: ");
    int arrayAmount = input.nextInt();
    int[] array = new int[arrayAmount];
    int sum = 0;
    for(int i = 0; i < arrayAmount; i++) {
      System.out.print("Enter a number: ");
      array[i] = input.nextInt();
      sum += array[i];
    }
    
    //Display data
    double average = sum / (arrayAmount / 1.0);
    System.out.println("The numbers entered are: \n");
    for(int i = 0; i < arrayAmount; i++) {
      System.out.println(array[i] + " and " + array[i] + " squared is " + 
        (array[i] * array[i]));
    }
    int nextToLast = array[arrayAmount - 2];
    System.out.println("Average = " + average);
    System.out.println("\nThe numbers entered in reverse order are:");
    for(int i = (arrayAmount - 1); i >= 0; i--) {
      System.out.println(array[i]);
    }
    System.out.println("Next to last number entered was " + nextToLast);
  }
}
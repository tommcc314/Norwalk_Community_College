/*
 * Program Name:            Lab07
 * Program Description:     This program takes in scores inputed by the user
 *                          and calculates max, min, average. It then sorts and 
 *                          counts the scores into separate letter grades and 
 *                          displays the scores in reverse order.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/12/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab07;
import java.util.Scanner;
public class Lab07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //get user input
    System.out.print("Enter the length of the array: ");
    int arrayLength = input.nextInt();
    int[] array = new int[arrayLength];
    System.out.println("Enter " + arrayLength + " scores:");
    for (int i = 0; i < arrayLength; i++)
      array[i] = input.nextInt();
    
    //display results
    printScores(array);
    System.out.println("\nLow:\t" + lowestScore(array));
    System.out.println("High:\t" + highestScore(array));
    System.out.println("Avg:\t" + averageScore(array));
    System.out.println("A's:\t" + countGrades(array, 'A'));
    System.out.println("B's:\t" + countGrades(array, 'B'));
    System.out.println("C's:\t" + countGrades(array, 'C'));
    System.out.println("D's:\t" + countGrades(array, 'D'));
    System.out.println("F's:\t" + countGrades(array, 'F'));
    printDescendingScores(array);
  }
  
  //define methods
  public static void printScores(int[] array) {
    System.out.print("Printed scores: ");
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
  }
  public static int lowestScore(int[] array) {
    int lowest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < lowest)
        lowest = array[i];
    }
    return lowest;
  }
  public static int highestScore(int[] array) {
    int highest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > highest)
        highest = array[i];
    }
    return highest; 
  }
  public static double averageScore(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    double average = (sum / 1.0) / array.length;
    return average;
  }
  public static int countGrades(int[] array, char gradeType) {
    int count = 0;
    for (int i = 0, min = 0, max = 0; i < array.length; i++) {
      switch (gradeType) {
      case 'A': max = 100;
                min = 90;
                break;
      case 'B': max = 89;
                min = 80;
                break;
      case 'C': max = 79;
                min = 70;
                break;
      case 'D': max = 69;
                min = 60;
                break;
      case 'F': max = 59;
                min = 0;
      }
      if (array[i] >= min && array[i] <= max)
        count++;
    }
    return count;
  }
  public static void printDescendingScores(int[] array) {
    java.util.Arrays.sort(array);
    System.out.print("Scores in descending order: ");
    for (int i = (array.length - 1); i >= 0; i--)
      System.out.print(array[i] + " ");
  }
}
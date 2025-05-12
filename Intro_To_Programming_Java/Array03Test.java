/*
 * Program Name:            Array03Test
 * Program Description:     This program asks the user for the number of 
 *                          students, the last names and the grades, then it 
 *                          calculates the average, the highest and the lowest 
 *                          grade
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/11/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass07a;
import java.util.Scanner;
public class Array03Test {
  public static void main(String[] args) {
    System.out.print("Enter the amount of students: ");
    Scanner input = new Scanner(System.in);
    int studentsListLength = input.nextInt();
    int gradesListLength = studentsListLength;
    String[] studentsList = new String[studentsListLength];
    int[] gradesList = new int[gradesListLength];
    for (int i = 0; i < studentsListLength; i++) {
      System.out.print("Enter a last name and grade: ");
      studentsList[i] = input.next();
      gradesList[i] = input.nextInt();
    }
    System.out.println("The students and grades entered are: ");
    for (int i = 0; i < studentsListLength; i++) {
      System.out.println(studentsList[i] + " " + gradesList[i]);
    }
    int total = 0;
    int highest = 0;
    int saveHighestIndex = 0;
    int lowest = 100;
    int saveLowestIndex = 0;
    for (int i = 0; i < gradesListLength; i++) {
      if (gradesList[i] > highest) {
        highest = gradesList[i];
        saveHighestIndex = i;
      } 
      if (gradesList[i] < lowest) {
        lowest = gradesList[i];
        saveLowestIndex = i;
      }
      total += gradesList[i];
    }
    double average = total / (gradesListLength / 1.0);
    System.out.println("\nAverage: " + average);
    System.out.println("Highest: " + studentsList[saveHighestIndex] + " " + 
      gradesList[saveHighestIndex]);
    System.out.println("Lowest: " + studentsList[saveLowestIndex] + " " +
      gradesList[saveLowestIndex]);
  }
}

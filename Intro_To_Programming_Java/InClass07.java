/*
 * Program Name:            InClass07
 * Program Description:     This program calculates the average and the number 
 *                          of scores above and below the average based on the 
 *                          scores entered by the user.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/10/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass07;
import java.util.Scanner;
public class InClass07 {
  public static void main(String[] args) {
    double[] scores = new double[100];
    double sum = 0;
    int i = 0;
    Scanner input = new Scanner(System.in);
    
    //get scores
    System.out.print("Enter a new score or negative number to exit: ");
    double scoreEntered = input.nextDouble();
    while (scoreEntered >= 0) {
      scores[i] = scoreEntered;
      sum += scoreEntered;
      i++;
      System.out.print("Enter a new score or negative number to exit: ");
      scoreEntered = input.nextDouble();
    }
    
    //calculate and print data
    System.out.println("Total scores entered: " + i);
    double average = sum / i;
    int scoresAbove = 0;
    int scoresBelow = 0;
    for(i--; i >= 0; i--) {
      if (scores[i] >= average)
        scoresAbove++;
      else
        scoresBelow++;
    }
    System.out.println("Average score: " + average);
    System.out.println("Number of scores above or equal to the average: " + 
      scoresAbove);
    System.out.println("Number of scores below the average: " + scoresBelow);
  }
}
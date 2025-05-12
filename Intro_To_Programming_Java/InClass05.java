/*
 * Program Name:            InClass05
 * Program Description:     This program will quiz the user with multiplication
 *                          problems.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            06/26/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass05;
import java.util.Scanner;
public class InClass05 {
  public static void main(String[] args) {
    int correctCount = 0;
    int questionCount = 0;
    int errorCount = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of questions in the quiz: ");
    int numberOfQuestions = input.nextInt();
    while (questionCount < numberOfQuestions) {
      
      // Get random integers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      
      // Prompt user for answers
      System.out.print("Question " + (questionCount + 1) + ": What is " + number1 +
        " * " + number2 + "? ");
      int answer = input.nextInt();
      if (number1 * number2 == answer) {
        System.out.println("Correct.");
        correctCount++;
      }
      else {
        System.out.println("Incorrect. " + number1 + " * " + number2 + " = " +
          (number1 * number2));
        errorCount++;
      }
      questionCount++;
    }
    System.out.printf("\nYou got " + errorCount + " wrong. Your score is %.1f", 
      (correctCount * 100 / (questionCount / 1.0)));
    if (correctCount / questionCount == 1) {
      System.out.print(". Congratulations!");
    }
  }
}

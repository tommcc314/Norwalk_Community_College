/*
 * Program Name:            TestStringQueue
 * Program Description:     This program enqueues and dequeues an array of names
 *                          specified by the user and states the number of names
 *                          that have the same first initial that the user has.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/26/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab10;
import java.util.Scanner;
public class TestStringQueue {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //get data
    System.out.print("Please enter your first name: ");
    String firstName = input.next();
    System.out.print("Please enter the number of names in your array.  Maximum is 10: ");
    int sizeOfArray = input.nextInt();
    while (sizeOfArray < 1 || sizeOfArray > 10) {
      System.out.print("Please enter the number of names in your array.  Maximum is 10: ");
      sizeOfArray = input.nextInt();
    }
    StringQueue names = new StringQueue(sizeOfArray);
    System.out.print("Please enter " + sizeOfArray + " names for the queue: ");
    for (int i = 0; i < sizeOfArray; i++) {
      names.enqueue(input.next());
    }
    char yourFirstInit = Character.toLowerCase(firstName.charAt(0));
    names.checkFirstInit(yourFirstInit);
    
    //display data
    System.out.println("Names dequeued:");
    while (!names.empty()) {
      System.out.print(names.dequeue() + " ");
    }
    System.out.println("\nThe number of names with your first initial is " + 
      names.firstInitCtr());
  }
}
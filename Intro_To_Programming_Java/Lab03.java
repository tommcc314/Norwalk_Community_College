/*
 * Program Name:               Lab03
 * Program Description:        This program sorts three random numbers of a 
 *                             specified range in ascending order, then displays
 *                             information about them including even/odd, sum,
 *                             etc.
 * Program Author:             Tom McCarthy
 * Date Created:               06/14/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab03;
import java.util.Scanner;
public class Lab03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //User input, response to invalid user input
    System.out.print("Please enter an integer between 0-99:");
    int integer = input.nextInt();
    int range1;
    int range2;
    if (integer < 0 || integer > 99) {
      System.out.print("Outside range. Please enter an integer between 0-99:");
      integer = input.nextInt();
      if (integer < 0 || integer > 99) {
        System.out.print("Outside range. Program ending.");
        return;
      }
      else {
        range1 = integer;
      }  
    }
    else {
      range1 = integer;
    }
    System.out.print("Next, enter another integer between 0-99:");
    integer = input.nextInt();
    if (integer < 0 || integer > 99) {
    System.out.print("Outside range. Please enter an integer between 0-99:");
    integer = input.nextInt();
      if (integer < 0 || integer > 99) {
      System.out.print("Outside range. Program ending.");
      return;
      }
      else {
        range2 = integer;
      }
    }
    else {
      range2 = integer;
    }
    
    //ordering integers for range
    if (range1 > range2) {
      int temp = range1;
      range1 = range2;
      range2 = temp;
    }
    System.out.println("The range begins at " + range1 + " and ends at " + 
      range2);
    
    //getting random integers
    int integer1 = range1 + (int)(Math.random() * ((range2 - range1) + 1));
    int integer2 = range1 + (int)(Math.random() * ((range2 - range1) + 1));
    int integer3 = range1 + (int)(Math.random() * ((range2 - range1) + 1));
    if (integer1 > integer2) {
      int temp = integer1;
      integer1 = integer2;
      integer2 = temp;
    }
    if (integer1 > integer3) {
      int temp = integer1;
      integer1 = integer3;
      integer3 = temp;
    }
    if (integer2 > integer3) {
      int temp = integer2;
      integer2 = integer3;
      integer3 = temp;
    }
    System.out.println("Three sorted random integers between " + range1 +
            " and " + range2 + " are:");
    
    //calculating odd or even
    String int1OddEven;
    String int2OddEven;
    String int3OddEven;
    if (integer1 % 2 == 0) {
      int1OddEven = "Even"; 
    }
    else {
      int1OddEven = "Odd";
    }
    if (integer2 % 2 == 0) {
      int2OddEven = "Even"; 
    }
    else {
      int2OddEven = "Odd";
    }
    if (integer3 % 2 == 0) {
      int3OddEven = "Even"; 
    }
    else {
      int3OddEven = "Odd";
    }
    System.out.println(integer1 + " " + int1OddEven);
    System.out.println(integer2 + " " + int2OddEven);
    System.out.println(integer3 + " " + int3OddEven);
    System.out.println("");
    
    //calculate sum, product, quotient
    System.out.println("Sum = " + (integer1 + integer2 + integer3));
    System.out.println("Product = " + (integer1 * integer2 * integer3));
    System.out.println("Quotient (Int1 / Int2 / Int3) = " + 
      ((integer1 / 1.0) / (integer2 / 1.0) / (integer3 / 1.0)));
  }
}
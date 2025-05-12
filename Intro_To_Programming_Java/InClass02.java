/*
 * Program Name:            Inclass02
 * Program Description:     This program calculates the volumes of two 
 *                          different sized cones and then reports the 
 *                          difference in volumes as a positive number.
 * Program Author:          Tom McCarthy
 *
 * Date Created:            06/12/2018
 * Change#        Change Date         Programmer Name         Description
 * -------        -----------         ---------------         -----------
 */
package inclass02;
import java.util.Scanner;
public class InClass02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to enter dimensions
    System.out.print("Enter the radius and height of the first cone:");
    double radius1 = input.nextDouble();
    double height1 = input.nextDouble();
    final double PI = 3.14159;
    
    //Calculate volume
    double volume1 = radius1 * radius1 * PI * height1 / 3.0;
    System.out.println("The volume of the first cone = " + volume1);
    
    //Prompt for second cone
    System.out.print("Enter the radius and height of the second cone:");
    double radius2 = input.nextDouble();
    double height2 = input.nextDouble();
    
    //Calculate volume
    double volume2 = radius2 * radius2 * PI * height2 / 3.0;
    System.out.println("The volume of the second cone = " + volume2);
    
    //Calculate difference in volumes
    double difference = Math.abs(volume1 - volume2);
    System.out.println("The difference in volumes = " + difference);
  }
}

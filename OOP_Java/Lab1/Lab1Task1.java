/*
 * Program Name:            Lab 1 Task 1: Geometric Shapes
 * Program Description:     This program performs the relevant calculations 
 *                          based on the shape that the user selects.
 *
 * Program Author:          Tom McCarthy
 *
 * Date Created:            06/09/2020
 * 
 */
package lab_1_task_1;
import java.util.Scanner;

public class Lab1Task1 {
    public static void main(String[] args) {
        System.out.println("Which shape would you like to work with?");
        System.out.println(" 1. Circle \n 2. Rectangle \n 3. Triangle");
        System.out.println("Enter the number that corresponds with the shape that you want to choose. (1-3)");    
        String proceed = "y";              
        while (proceed.equalsIgnoreCase("y")) {
            System.out.print("Your Shape Choice: ");
            Scanner input = new Scanner(System.in);
            int ShapeChoice = input.nextInt();
            if (ShapeChoice == 1) {
                System.out.print("Enter the radius of the circle: ");
                double Radius = input.nextDouble();
                while (Radius <=0) {
                    System.out.print("Error. Radius must be a positive number. Please enter a valid radius: ");
                    Radius = input.nextDouble();
                }
                double CircleArea = Math.PI * Radius * Radius;
                double CirclePerimeter = 2 * Math.PI * Radius;
                System.out.println("Area: " + CircleArea);
                System.out.println("Perimter: " + CirclePerimeter);               
            }
            else if (ShapeChoice == 2) {
                System.out.print("Enter the length of the rectangle: ");
                double Length = input.nextDouble();
                while (Length <=0) {
                    System.out.print("Error. Length must be a positive number. Please enter a valid length: ");
                    Length = input.nextDouble();
                }
                System.out.print("Enter the width of the rectangle: ");
                double Width = input.nextDouble();
                while (Width <=0) {
                    System.out.print("Error. Width must be a positive number. Please enter a valid width: ");
                    Width = input.nextDouble();
                }
                double RectangleArea = Length * Width;
                double RectanglePerimeter = 2 * (Length + Width);
                System.out.println("Area: " + RectangleArea);
                System.out.println("Perimeter: " + RectanglePerimeter);
            }
            else if (ShapeChoice == 3) {
                System.out.print("Enter the length of the first side: ");
                double Side1 = input.nextDouble();
                while (Side1 <=0) {
                    System.out.print("Error. The side length must be a positive number. Please enter a valid side length: ");
                    Side1 = input.nextDouble();
                }
                System.out.print("Enter the length of the second side: ");
                double Side2 = input.nextDouble();
                while (Side2 <=0) {
                    System.out.print("Error. The side length must be a positive number. Please enter a valid side length: ");
                    Side2 = input.nextDouble();
                }
                System.out.print("Enter the length of the third side: ");
                double Side3 = input.nextDouble();         
                while (Side3 <=0) {
                    System.out.print("Error. The side length must be a positive number. Please enter a valid side length: ");
                    Side3 = input.nextDouble();
                }
                double S = (Side1 + Side2 + Side3) / 2;
                double TriangleArea = Math.sqrt(S * (S - Side1) * (S - Side2)
                                      * (S - Side3));
                double TrianglePerimeter = Side1 + Side2 + Side3;
                System.out.println("Area: " + TriangleArea);
                System.out.println("Perimeter: " + TrianglePerimeter);
            }
            else {
                System.out.println("Error. Please enter a valid shape choice.");
                continue;
            }
        System.out.print("Would you like to choose another shape? (y/n) : ");
        proceed = input.next();
        }
    }   
}

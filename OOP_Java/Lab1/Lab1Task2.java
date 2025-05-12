/*
 * Program Name:            Lab 1 Task 2: Temperature Converter
 * Program Description:     This program converts temperatures between the
 *                          Celsius and Fahrenheit scales.
 *
 * Program Author:          Tom McCarthy
 *
 * Date Created:            06/09/2020
 * 
 */
package lab_1_task_2;
import java.util.Scanner;

public class Lab1Task2 {
    public static void main(String[] args) {
        System.out.println("Which type of temperature conversion would you like to perform?");
        System.out.println(" 1. Celsius to Fahrenheit");
        System.out.println(" 2. Fahrenheit to Celsius");
        System.out.println("Enter the number that corresponds with the conversion of your choice. (1 or 2)");       
        String proceed = "y";
        while (proceed.equalsIgnoreCase("y")) {
            System.out.print("Your temperature conversion choice: ");
            Scanner input = new Scanner(System.in);
            int TempChoice = input.nextInt();           
            if (TempChoice == 1) {
                System.out.print("Enter the temperature in Celsius: ");
                double Celsius = input.nextDouble();
                double Fahrenheit = Celsius * 9 / 5 + 32;
                System.out.println("Temperature in Farenheit: " + Fahrenheit);
            }
            else if (TempChoice == 2) {
                System.out.print("Enter the temperature in Farenheit: ");
                double Fahrenheit = input.nextDouble();
                double Celsius = (Fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + Celsius);
            }
             else {
                System.out.println("Error. Please enter a valid conversion choice.");
                continue;
            }
        System.out.print("Would you like to choose another conversion? (y/n) : ");
        proceed = input.next();
        }
    }  
}
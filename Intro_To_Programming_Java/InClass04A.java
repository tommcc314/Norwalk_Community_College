/*
 * Program Name:           InClass04A
 * Program Description:    This program converts an ASCII or Unicode decimal 
 *                         value to a character, and vice versa.
 * Program Author:         Tom McCarthy
 * Date Created:           06/20/2018
 *
 * Change#        Change Date         Programmer Name         Description
 * -------        -----------         ---------------         -----------
 */
package inclass04a;
import java.util.Scanner; 
public class InClass04A {
  @SuppressWarnings("UnusedAssignment")
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Convert an ASCII decimal value (0 – 127) to a character.
    System.out.print("Enter an ASCII decimal value: ");
    byte asciiDecimal = input.nextByte();
    char asciiChar = (char)asciiDecimal;
    System.out.println("The character for the ASCII decimal value " + asciiDecimal + " is " + asciiChar);
    
    //Convert a Unicode decimal value to a character.
    System.out.print("Enter a Unicode decimal value: ");
    short unicodeDecimal = input.nextShort();
    char unicodeChar = (char)unicodeDecimal;
    System.out.println("The character for Unicode decimal value " + unicodeDecimal + " is " + unicodeChar);
    
    //Convert a character to its Unicode decimal value.
    System.out.print("Enter a character: ");
    char unicodeChar2 = input.next().charAt(0);
    int unicodeInt = (int)unicodeChar2;
    System.out.println("The Unicode decimal value for the character " + unicodeChar2 + " is " + unicodeInt);
    
    //Convert a decimal value between 0-15 to a hex character.
    System.out.print("Enter a decimal value (0 to 15): ");
    byte hexDecimal = input.nextByte();
    if (hexDecimal < 0 || hexDecimal > 15) {
      System.out.println("Error. Invalid Imput. ");
      hexDecimal = input.nextByte();
    }
    else if (0 < hexDecimal && hexDecimal < 10) {
      System.out.println("The hex character is " + hexDecimal);
    }
    else if (10 <= hexDecimal && hexDecimal <= 15) {
      char hexChar = (char)('A' + hexDecimal - 10);
      System.out.println("The hex character is " + hexChar);
    }
  }
}
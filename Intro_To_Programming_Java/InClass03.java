/*
 * Program Name:                 Inclass03
 * Program Description:          This program calculates and displays a 
 *                               restaurant bill, and display tips if the user
 *                               wants the tip recommendations.
 * Program Author:               Tom McCarthy
 * Date Created:                 06/13/2018
 * 
 * Change#        Change Date         Programmer Name         Description
 * -------        -----------         ---------------         -----------
 */
package inclass03;
import java.util.Scanner;
public class InClass03 {
  public static void main(String[] args) {
    
    //constants
    final double LOW_TIP_RATE = 0.10;
    final double MED_TIP_RATE = 0.15;
    final double HIGH_TIP_RATE = 0.20;
    final double CT_TAX_RATE = 0.0635;
    
    // Prompt user for prices
    System.out.print("Enter the price of your appetizer: ");
    Scanner input = new Scanner(System.in);
    double appetizerPrice = input.nextDouble();
    System.out.print("Enter the price of your dinner: ");
    double dinnerPrice = input.nextDouble();
    System.out.print("Enter the price of your dessert: ");
    double dessertPrice = input.nextDouble();
    
    //Calculate totals
    double totalMeals = appetizerPrice + dinnerPrice + dessertPrice;
    double totalTax = totalMeals * CT_TAX_RATE;
    double totalBill = totalMeals + totalTax;
    double lowTip = totalMeals * LOW_TIP_RATE;
    double medTip = totalMeals * MED_TIP_RATE;
    double highTip = totalMeals * HIGH_TIP_RATE;
    
    //Tip recommendations
    System.out.print("Enter 1 to print tip recommendations, or 0 not to print tip recommendations: ");
    int recommend = input.nextInt();
    
    //Show totals
    System.out.println("Appetizer price:         $" + appetizerPrice);
    System.out.println("Dinner price:            $" + dinnerPrice);
    System.out.println("Dessert price:           $" + dessertPrice);
    System.out.println("------------------------------------");
    System.out.println("Total meals:             $" + totalMeals);
    System.out.println("CT tax:                  $" + (int)(totalTax * 100)/100.0);
    System.out.println("Total bill:              $" + (int)(totalBill * 100)/100.0);
    System.out.println("");
    if (recommend == 1) {
      System.out.println("Tip recommendations:");
      System.out.println("Low Tip (10%):           $" + (int)(lowTip * 100)/100.0);
      System.out.println("Medium tip (15%):        $" + (int)(medTip * 100)/100.0);
      System.out.println("High tip (20%):          $" + (int)(highTip * 100)/100.0);
    }
    System.out.println("\n Thank you. Your waiter's name is Tom.   \u263A");
  }
}

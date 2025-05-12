/*
 * Program Name:            Lab06
 * Program Description:     This program calculates commission based on the 
 *                          sales amount and displays the information in a 
 *                          table with the range and increment specified by the 
 *                          user.
 *       
 * Program Author:          Tom McCarthy
 * Date Created:            07/05/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab06;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //get table data
    System.out.println("Enter table start, table end, and increment: ");
    double tableStart = input.nextDouble();
    double tableEnd = input.nextDouble();
    double increment = input.nextDouble();
    System.out.println("\nSales Amount            Commission");
    double salesAmount = tableStart;
    
    //print table with correct format
    DecimalFormat df = new DecimalFormat("$###,###,##0.00");
    for (; salesAmount <= tableEnd; salesAmount += increment) {
      System.out.println(df.format(salesAmount) + "\t\t" + 
      df.format(computeCommission(salesAmount)));
    }
  }
  
  //define compute commission method
  public static double computeCommission(double salesAmount) {
    if (salesAmount <= 10000)
      return (salesAmount * 0.075);
    else if (salesAmount >10000 && salesAmount <= 20000)
      return (750 + (salesAmount - 10000) * 0.1125);
    else
      return (1875 + (salesAmount - 20000) * 0.145);
  }
}
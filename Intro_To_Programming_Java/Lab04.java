/*
 * Program Name:              Lab04 - Paystub Calculations
 * Program Description:       This program calculates net paycheck information
 *
 * Program Author:            Tom McCarthy
 * Date Created:              06/21/2018
 *
 * Change#        Change Date         Programmer Name         Description
 * -------        -----------         ---------------         -----------
 */
package lab04;
import java.util.Scanner;
public class Lab04 {
  @SuppressWarnings("MalformedFormatString")
  public static void main(String[] args) {
    final double SOC_SEC_RATE = 0.06;
    final double MEDICARE_RATE = 0.01;
    final double UNION_DUES_RATE = 0.01;
    final double RETIREMENT_PLAN_RATE = 0.02;
    final double RETIREMENT_HEALTH_RATE = 0.03;
    double grossPay = 0;
    Scanner input = new Scanner(System.in);
    
    //Prompt user for salary information
    System.out.print("Please enter number of hours worked in a pay period: ");
    double hoursWorked = input.nextDouble();
    System.out.print("Please enter hourly pay rate: ");
    double payRate = input.nextDouble();
    System.out.print("Please enter federal tax withholding rate (e.g. 0.15): ");
    double fedTaxWithheldRate = input.nextDouble();
    System.out.print("Please enter state tax withholding rate (e.g. 0.045): ");
    double stateTaxWithheldRate = input.nextDouble();
    
    //Calculate and display gross pay data
    if (hoursWorked <= 40) {
      grossPay = hoursWorked * payRate;
    }
    else if (hoursWorked > 40){
      grossPay = (40 * payRate) + ((hoursWorked - 40) * 1.5 * payRate);
    }
    System.out.println("");
    System.out.println("*************************");
    System.out.println("*  Paystub Information: *");
    System.out.println("*************************");
    System.out.printf("Hours Worked:  %4.2f\n", hoursWorked);
    System.out.printf("Pay Rate:      $%4.2f\n", payRate);
    System.out.printf("Gross Pay:     $%4.2f\n", grossPay);
    System.out.println("Deductions:");
    double fedTax = grossPay * fedTaxWithheldRate;
    double stateTax = grossPay * stateTaxWithheldRate;
    double socSecTax = grossPay * SOC_SEC_RATE;
    double medicareTax = grossPay * MEDICARE_RATE;
    double unionDues = grossPay * UNION_DUES_RATE;
    double retirementPlan = grossPay * RETIREMENT_PLAN_RATE;
    double retirementHealth = grossPay * RETIREMENT_HEALTH_RATE;
    System.out.printf("\tFederal Tax (" + (fedTaxWithheldRate * 100) + "%%):" + "\t\t$%4.2f\n", fedTax);
    System.out.printf("\tState Tax (" + (stateTaxWithheldRate * 100) + "%%):" + "\t\t$%4.2f\n", stateTax);
    System.out.printf("\tSocial Security Tax (" + (SOC_SEC_RATE * 100) + "%%):" + "\t$%4.2f\n", socSecTax);
    System.out.printf("\tMedicare Tax (" + (MEDICARE_RATE * 100) + "%%):" + "\t\t$%4.2f\n", medicareTax);
    System.out.printf("\tUnion Dues (" + (UNION_DUES_RATE * 100) + "%%):" + "\t\t$%4.2f\n", unionDues);
    System.out.printf("\tRetirement Plan (" + (RETIREMENT_PLAN_RATE * 100) + "%%):" + "\t\t$%4.2f\n", retirementPlan);
    System.out.printf("\tRetirement Health (" + (RETIREMENT_HEALTH_RATE * 100) + "%%):" + "\t$%4.2f\n", retirementHealth);
    double totalDeductions = (.13 + fedTaxWithheldRate + stateTaxWithheldRate) * grossPay;
    System.out.printf("Total Deductions:" + "\t\t\t$%4.2f\n", totalDeductions);
    System.out.printf("Net Pay:" + "\t\t\t\t$%4.2f\n", (grossPay - totalDeductions));
  }
}
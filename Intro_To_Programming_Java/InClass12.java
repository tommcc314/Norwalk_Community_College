/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass12;
import java.util.Scanner;
public class InClass12 {
    public static void main(String[] args) throws Exception{
        java.io.File outputFile = new java.io.File("EmployeeBeneficiaryPayoutAndEmails.txt");
        java.io.File inputFile = new java.io.File("EmployeeLifeInsurance.txt");
        if (outputFile.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        Scanner input = new Scanner (System.in);
        System.out.println("Enter domain name (e.g. ncc): ");
        String company = input.next();
        Scanner inputFromFile = new Scanner(inputFile);
        String firstName;
        String midName;
        String lastName;
        java.io.PrintWriter output = new java.io.PrintWriter(outputFile);
        System.out.println("Exception Report: ");
        while(inputFromFile.hasNext()){
            String record = inputFromFile.next();
            String[] tokens = record.split("%",0);
            firstName = tokens[0];
            midName = tokens[1];
            lastName = tokens[2];
            int insuranceAmount = Integer.parseInt(tokens[3]);
            int beneficiaryNumber = Integer.parseInt(tokens[4]);
            String endTag = ("@" + company + ".com");
            try{
                int perPerson = insuranceAmount/beneficiaryNumber;
            }
            catch(ArithmeticException Exception){
                System.out.println(firstName + " " + midName + " " + lastName 
                        + "has zero beneficiaries and was skipped");  
                continue;
            }
        String finalOutput = (firstName + "%" + midName + "%" + lastName + "%" + 
          insuranceAmount/beneficiaryNumber + "%" + 
          firstName.substring(0,1).toLowerCase() + 
          midName.substring(0,1).toLowerCase() +
          lastName.toLowerCase() +
          endTag.toLowerCase());
        output.println(finalOutput);
       }
        output.close();
        System.out.println("EmployeeBeneficiaryPayoutAndEmails.txt file was written successfully. ");
        
    }
    
}

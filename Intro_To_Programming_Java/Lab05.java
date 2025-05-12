/*
 * Program Name:            Lab05
 * Program Description:     This program calculates the value of pi using 
 *                          the Nilakantha method.
 *       
 * Program Author:          Tom McCarthy
 * Date Created:            06/28/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package lab05;
public class Lab05 {
  public static void main(String[] args) {
    double pi = 3;
    double savePi = 0;
    double term;
    double saveIteration = 0;
    int sign = 1;
    boolean isRangeFound = false;
    for (double iteration = 1; iteration <= 1000; iteration++) {
      term = (sign * 4) / ((2 * iteration) * (2 * iteration + 1) * 
        (2 * iteration + 2));
      pi = pi + term;
      sign = sign * -1;
      if (iteration == 200 || iteration == 500 || iteration == 1000) { 
        System.out.printf("\nThe value of \u03C0 is: %.10f", pi); 
        System.out.printf(" when i = " + (int)(iteration));
      }
      if (isRangeFound == false && pi >=3.14159265 && pi < 3.14159266) {
        savePi = pi;
        saveIteration = iteration;
        isRangeFound = true;
      }
    }
    System.out.printf("\nThe number of iterations to get to 3.14159265 is " +
      (int)(saveIteration) + ". \u03C0 = %.10f", savePi);
  }
}
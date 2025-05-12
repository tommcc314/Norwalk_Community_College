/*
 * Program Name: InClass01A
 * Program Description: This program uses Cramer's Rule to calculate the values of x and y for two linear equations.
 * If: ax + by = e and cx + dy = f
 * Then: x = (ed - bf)/(ad - bc) and y = (af - ec)/(ad - bc)
 * Program Author: Tom McCarthy
 * Date Created: 06/06/2018
 * Change#          Change Date        Programmer Name      Description
 * --------         ----------         ----------------     -------------
 */
package inclass01a;

public class InClass01A {
    public static void main(String[] args) {
        System.out.println("Cramer's Rule states:");
        System.out.println("If:");
        System.out.println("  ax + by = e");
        System.out.println("  cx + dy = f");
        System.out.println("Then:");
        System.out.println("  x = (ed - bf)/(ad - bc)");
        System.out.println("  y = (af - ec)/(ad - bc)");
        System.out.println("Using Cramer's Rule, the values of x and y for the following two linear equations:");
        System.out.println("    3.4x + 50.2y = 44.5  and");
        System.out.println("    2.1x + 0.55y = 5.9");
        System.out.println("are:");
        // Plug coefficients into formula
        System.out.println("x = " + ((44.5 * 0.55 - 50.2 * 5.9)/(3.4 * 0.55 - 50.2 * 2.1)));
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1)/(3.4 * 0.55 - 50.2 * 2.1)));
    }
}
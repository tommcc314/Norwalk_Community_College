/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class Triangle extends Shape{
    protected double s1;
    protected double s2;
    protected double s3;
    protected double s;
    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        s = (s1 + s2 + s3) / 2;
        area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        perimeter = s1 + s2 + s3;
    }   
    public static double askForS1() {
        String s1Input = JOptionPane.showInputDialog(null, "Enter the length of the first side: ");
        StringTokenizer st1 = new StringTokenizer(s1Input);
        double s1 = Double.parseDouble(st1.nextToken());
        return s1;
    }
    public static double askForS2() {
        String s2Input = JOptionPane.showInputDialog(null, "Enter the length of the second side: ");
        StringTokenizer st2 = new StringTokenizer(s2Input);
        double s2 = Double.parseDouble(st2.nextToken()); 
        return s2;
    } 
    public static double askForS3() {
        String s3Input = JOptionPane.showInputDialog(null, "Enter the length of the third side: ");
        StringTokenizer st3 = new StringTokenizer(s3Input);
        double s3 = Double.parseDouble(st3.nextToken());  
        return s3;
    }
    @Override
    public double getArea() {       
        return area;
    }

    @Override
    public double getPerimeter() {       
        return perimeter;
    }   
}
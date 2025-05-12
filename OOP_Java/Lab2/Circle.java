/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Circle extends Shape{
    protected double radius;  
    public Circle(double radius) {
        this.radius = radius;
        area = radius * radius * Math.PI;
        perimeter = 2 * radius * Math.PI;
    }
    public static double askForRadius() {
        String cirRadiusIn = JOptionPane.showInputDialog( "Enter the radius: " );
        StringTokenizer stRadius = new StringTokenizer(cirRadiusIn);
        double inputRadius = Double.parseDouble(stRadius.nextToken()); 
        return inputRadius;
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

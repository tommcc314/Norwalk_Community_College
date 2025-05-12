/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Cylinder extends Circle{
    private double volume;
    private double lateralArea;
    private double surfaceArea;
    public Cylinder(double radius, double height) {
        super(radius);
        volume = super.getArea() * height;
        lateralArea = super.getPerimeter() * height;
        surfaceArea = lateralArea + (2 * super.getArea());
    }
    public static double askForHeight() {
        String heightIn = JOptionPane.showInputDialog( "Enter the height: " );
        StringTokenizer stHeight = new StringTokenizer(heightIn);      
        double inputHeight = Double.parseDouble(stHeight.nextToken());
        return inputHeight;
    }
    public double getVolume() {       
        return volume;
    }
    public double getLateralArea() {         
        return lateralArea;
    }
    public double getSurfaceArea() {         
        return surfaceArea;
    }
}

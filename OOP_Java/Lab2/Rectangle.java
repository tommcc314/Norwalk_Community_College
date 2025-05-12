/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class Rectangle extends Shape{
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
        perimeter = 2 * (length + width);
    }
    
    public static double askForLength() {
        String lengthIn = JOptionPane.showInputDialog( "Enter the length: " );
        StringTokenizer stLength = new StringTokenizer(lengthIn);
        double inputLength = Double.parseDouble(stLength.nextToken());      
        return inputLength;    
    }
    
    public static double askForWidth() {
        String widthIn = JOptionPane.showInputDialog( "Enter the width: " );
        StringTokenizer stWidth = new StringTokenizer(widthIn);
        double inputWidth = Double.parseDouble(stWidth.nextToken());
        return inputWidth;
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
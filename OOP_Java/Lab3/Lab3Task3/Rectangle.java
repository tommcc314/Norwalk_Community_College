/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;

public class Rectangle extends Shape{
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
        perimeter = 2 * (length + width);
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
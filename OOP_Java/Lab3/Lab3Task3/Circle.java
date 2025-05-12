/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;

public class Circle extends Shape{
    protected double radius;  
    public Circle(double radius) {
        this.radius = radius;
        area = radius * radius * Math.PI;
        perimeter = 2 * radius * Math.PI;
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

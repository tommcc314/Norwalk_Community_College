/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;

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
 
    @Override
    public double getArea() {       
        return area;
    }

    @Override
    public double getPerimeter() {       
        return perimeter;
    }   
}
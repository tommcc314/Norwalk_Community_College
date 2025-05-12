/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;

public class RectangularPrism extends Rectangle{
    private double volume;
    private double lateralArea;
    private double surfaceArea;
    public RectangularPrism(double length, double width, double height) {
        super(length, width);
        volume = super.getArea() * height;
        lateralArea = super.getPerimeter() * height;
        surfaceArea = lateralArea + (2 * super.getArea());
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
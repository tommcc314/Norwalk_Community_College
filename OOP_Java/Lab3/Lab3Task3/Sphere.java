/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task3;
public class Sphere extends Circle{
    private double volume;
    private double surfaceArea;
    public Sphere(double radius) { 
        super(radius);
        volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        surfaceArea = 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return volume;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
}
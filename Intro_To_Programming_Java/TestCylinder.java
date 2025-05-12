/*
 * Program Name:            TestCylinder
 * Program Description:     This program creates a cylinder object and displays
 *                          the surface area and volume of the cylinder given 
 *                          its radius is 10 and the height is 30.
 * Program Author:          Tom McCarthy
 * Date Created:            07/17/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09;
public class TestCylinder {
  public static void main(String[] args) {
    SimpleCylinder cylinder1 = new SimpleCylinder();
    double surfaceArea = cylinder1.getSurfaceArea();
    double volume = cylinder1.getVolume();
    System.out.println("The surface area of the cylinder of radius " + 
      cylinder1.radius + " and height " + cylinder1.height + " is " + 
      surfaceArea);
    System.out.println("The volume of the cylinder of radius " + 
      cylinder1.radius + " and height " + cylinder1.height + " is " + 
      volume);
  }
}
class SimpleCylinder {
  double radius;
  double height;
  SimpleCylinder() {
    radius = 10;
    height = 30;
  }
  SimpleCylinder(double newRadius, double newHeight) {
    radius = newRadius;
    height = newHeight;
  }
  double getSurfaceArea() {
    return 2 * Math.PI * (radius * radius) + Math.PI * 2 * radius * height;
  }
  double getVolume() {
    return Math.PI * radius * radius * height;
  }
}
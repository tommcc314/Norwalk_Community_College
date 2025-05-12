/*
 * Program Name:            TestRectangle
 * Program Description:     This program creates a rectangle object and displays
 *                          the area, perimeter and diagonal of the rectangle 
 *                          given that its length is 10 and the width is 20.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/17/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09;
public class TestRectangle {
  public static void main(String[] args) {
    SimpleRectangle rectangle1 = new SimpleRectangle();
    double area = rectangle1.getArea();
    double perimeter = rectangle1.getPerimeter();
    double diagonal = rectangle1.getDiagonal();
    System.out.println("The area of the rectangle of length " + 
     rectangle1.length + " and width " + rectangle1.width + " is " + area);
    System.out.println("The perimeter of the rectangle of length " + 
     rectangle1.length + " and width " + rectangle1.width + " is " + perimeter);
    System.out.println("The diagonal of the rectangle of length " + 
     rectangle1.length + " and width " + rectangle1.width + " is " + diagonal);
  }
}
class SimpleRectangle {
  double length;
  double width;
  SimpleRectangle() {
    length = 10;
    width = 20;
  }
  SimpleRectangle(double newLength, double newWidth) {
    length = newLength;
    width = newWidth;
  }
  double getArea() {
    return length * width;
  }
  double getPerimeter() {
    return (2 * length) + (2 * width);
  }
  double getDiagonal() {
    return Math.sqrt((length * length) + (width * width));
  }
}
/*
 * Program Name:            TestShapes
 * Program Description:     This program creates a circle, rectangle, and 
 *                          triangle object and displays the quantity of each 
 *                          along with their areas using methods from the other 
 *                          classes.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/17/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09a;
public class TestShapes {
  public static void main(String[] args) {
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields();
    System.out.println("The area of the circle of radius 5.0 is " + 
      myCircle.getArea());
    RectangleWithPrivateDataFields myRectangle = new RectangleWithPrivateDataFields();
    System.out.println("The area of the rectangle of length 10.0 and width 20.0 " 
      + "is " + myRectangle.getArea());
    TriangleWithPrivateDataFields myTriangle = new TriangleWithPrivateDataFields();
    System.out.println("The area of the triangle of base 5.0 and height 10.0 is " 
      + myTriangle.getArea());
    System.out.println("The number of Circle objects is " + 
      myCircle.getNumberOfObjects());
    System.out.println("The number of Rectangle objects is " + 
      myRectangle.getNumberOfObjects());
    System.out.println("The number of Triangle objects is " + 
      myTriangle.getNumberOfObjects());
    System.out.println("The number of Shape objects is " + 
      (myCircle.getNumberOfObjects() + myRectangle.getNumberOfObjects() + 
      myTriangle.getNumberOfObjects()));
  }
}
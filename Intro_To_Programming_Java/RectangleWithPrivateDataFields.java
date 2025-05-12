/*
 * Program Name:            RectangleWithPrivateDataFields
 * Program Description:     This program defines rectangles using private 
 *                          variables and calculates the number of rectangles 
 *                          and the area.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/18/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09a;
public class RectangleWithPrivateDataFields {
  private double length;
  private double width;
  private static int numberOfObjects = 0;
  RectangleWithPrivateDataFields() {
    length = 10;
    width = 20;
    numberOfObjects++;
  }
  RectangleWithPrivateDataFields(double newLength, double newWidth){
    length = newLength;
    width = newWidth;
    numberOfObjects++;
  }
  public int getNumberOfObjects() {
    return numberOfObjects;
  }
  public double getArea() {
    return length * width;
  }
}
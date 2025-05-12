/*
 * Program Name:            CircleWithPrivateDataFields
 * Program Description:     This program defines circles using private variables
 *                          and calculates the number of circles and the area.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/18/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09a;
public class CircleWithPrivateDataFields {
  private double radius;
  private static int numberOfObjects = 0;
  CircleWithPrivateDataFields() {
      radius = 5;
      numberOfObjects++;
  }
  CircleWithPrivateDataFields(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }
  public int getNumberOfObjects() {
    return numberOfObjects;
  }
  public double getArea() {
    return radius * radius * Math.PI;
  }
}

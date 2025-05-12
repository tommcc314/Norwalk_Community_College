/*
 * Program Name:            TriangleWithPrivateDataFields
 * Program Description:     This program defines triangles using private 
 *                          variables and calculates the number of triangles and
 *                          the area.
 *                          
 * Program Author:          Tom McCarthy
 * Date Created:            07/18/2018
 * Change #       Change Date       Programmer Name        Description
 * --------       -----------       ---------------        ----------------
 */
package inclass09a;
public class TriangleWithPrivateDataFields {
  private double base;
  private double height;
  private static int numberOfObjects = 0;
  TriangleWithPrivateDataFields() {
    base = 5;
    height = 10;
    numberOfObjects++;
  }
  TriangleWithPrivateDataFields(double newBase, double newHeight){
    base = newBase;
    height = newHeight;
    numberOfObjects++;
  }
  public int getNumberOfObjects() {
    return numberOfObjects;
  }
  public double getArea() {
    return base * height / 2.0;
  }
}

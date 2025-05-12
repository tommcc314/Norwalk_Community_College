/*
 * Program Name:            Lab 2 Task 1: Shape Application 
 * Program Description:     This program performs the relevant calculations 
 *                          based on the shape that the user selects.
 *
 * Program Author:          Tom McCarthy
 *
 * Date Created:            06/25/2020
 * 
 */
package lab2;
import javax.swing.JOptionPane;
public class ShapeApplication {
    public static void main(String[] args) {
        boolean continuationChoice = true;
        while (continuationChoice) {
            Object[] shapeOptions = {"Circle", "Rectangle", "Triangle", "Cylinder", "Rectangular Prism", "Triangular Prism", "Sphere"};
            int shapeChoice = JOptionPane.showOptionDialog(null, "Choose the shape that you would like to work with", 
                "Shape Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, 
                null, shapeOptions, shapeOptions[0]);
            switch (shapeChoice) {
            case 0:
                double cirRadius = Circle.askForRadius();
                Circle c = new Circle(cirRadius);
                JOptionPane.showMessageDialog(null, "Area: " + c.getArea() + "\nPerimeter: " + c.getPerimeter());
                break;
            case 1:
                double rectLength = Rectangle.askForLength();
                double rectWidth = Rectangle.askForWidth();
                Rectangle r = new Rectangle(rectLength, rectWidth);
                JOptionPane.showMessageDialog(null, "Area: " + r.getArea() + "\nPerimeter: " + r.getPerimeter());
                break;
            case 2:
                double tS1 = Triangle.askForS1();
                double tS2 = Triangle.askForS2();
                double tS3 = Triangle.askForS3();
                Triangle t = new Triangle(tS1, tS2, tS3);
                JOptionPane.showMessageDialog(null, "Area: " + t.getArea() + "\nPerimeter: " + t.getPerimeter());
                break;
            case 3:
                double cylRadius = Cylinder.askForRadius();
                double cylHeight = Cylinder.askForHeight();
                Cylinder cy = new Cylinder(cylRadius, cylHeight);
                JOptionPane.showMessageDialog(null, "Volume: " + cy.getVolume() + "\nLateral Area: " + cy.getLateralArea() + "\nSurface Area: " + cy.getSurfaceArea());
                break;
            case 4:
                double rpLength = RectangularPrism.askForLength();
                double rpWidth = RectangularPrism.askForWidth();
                double rpHeight = RectangularPrism.askForHeight();
                RectangularPrism rp = new RectangularPrism(rpLength, rpWidth, rpHeight);
                JOptionPane.showMessageDialog(null, "Volume: " + rp.getVolume() + "\nLateral Area: " + rp.getLateralArea() + "\nSurface Area: " + rp.getSurfaceArea());
                break;
            case 5:
                double tpS1 = TriangularPrism.askForS1();
                double tpS2 = TriangularPrism.askForS2();
                double tpS3 = TriangularPrism.askForS3();
                double tpHeight = TriangularPrism.askForHeight();
                TriangularPrism tp = new TriangularPrism(tpS1, tpS2, tpS3, tpHeight);
                JOptionPane.showMessageDialog(null, "Volume: " + tp.getVolume() + "\nLateral Area: " + tp.getLateralArea() + "\nSurface Area: " + tp.getSurfaceArea());
                break;
            case 6:               
                double spRadius = Circle.askForRadius();
                Sphere sp = new Sphere(spRadius);
                JOptionPane.showMessageDialog(null, "Volume: " + sp.getVolume() + "\nSurface Area: " + sp.getSurfaceArea());
                break;
            }
            Object[] options = {"Yes", "No"};
            int continuation = JOptionPane.showOptionDialog(null, "Would you like to work with another shape?", "Continue?", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            continuationChoice = continuation == 0;
        }
    } 
}
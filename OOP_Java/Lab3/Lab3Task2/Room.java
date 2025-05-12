/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task2;
public class Room {
    private float length;
    private float width;
    private float TotalArea;
    private float WallArea;
    private float PaintAmount;
    private final int DoorArea = 20;
    private final int WindowArea = 12;
    public Room(float length, float width) {
        this.length = length;
        this.width = width;  
    } 
    public double getPaintAmount(int numOfDoors, int numOfWindows) {
        TotalArea = 16 * (length + width);
        WallArea = TotalArea - (DoorArea * numOfDoors) - (WindowArea * numOfWindows);
        PaintAmount = WallArea / 120;
        return PaintAmount;
    }
}

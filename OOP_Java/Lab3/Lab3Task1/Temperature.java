/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3task1;
public class Temperature {
    private float fahrenheit;
    private float celsius;
    public Temperature(float fahrenheit, float celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;        
    }
    public double getFahrenheit() {
        fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }
    public double getCelsius() {
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}

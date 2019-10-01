/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class NumberConversionModel {
    private double milesToKm = 1.609344;
    
    public String getGreetingsMessage(String name){
        return "Hello, " + name + ". Greetings from the top Java developer class in town";
    }
    
    public double getMilesFromKilometers(double km){
        return km / milesToKm;
    }
    
    public double getKilometersFromMiles(double miles){
        return miles * milesToKm;
    }
}

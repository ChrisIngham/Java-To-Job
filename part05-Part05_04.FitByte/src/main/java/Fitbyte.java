/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Fitbyte {
    private int age;
    private int restingHR;
    
    public Fitbyte(int age, int restHR){
        this.age = age;
        this.restingHR = restHR;
    }
    
    public double targetHeartRate(double percentOfMax){
        double maxHR = 206.3 - (0.711 * this.age);
        return (maxHR - (double)this.restingHR) * (double)percentOfMax + this.restingHR;
    }
        
    
    
}

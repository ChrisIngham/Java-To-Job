/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Timer {
    private int hundreds;
    private int seconds;
    
    public Timer(){
        hundreds = 0;
        seconds = 0;
    }
    
    public void advance(){
        hundreds++;
        if (hundreds >= 100){
            seconds++;
            hundreds = 0;
        }
        if (seconds >= 60){
            seconds = 0;
        }
    }
    
    @Override
    public String toString(){
        if (seconds < 10 && hundreds < 10){
            return "0" + seconds + ":0" + hundreds;
        }else if (seconds <10){
            return "0" + seconds + ":" + hundreds;
        }else if (hundreds < 10){
            return seconds + ":0" + hundreds;
        }else{
            return seconds + ":" + hundreds;
        }
    }
}

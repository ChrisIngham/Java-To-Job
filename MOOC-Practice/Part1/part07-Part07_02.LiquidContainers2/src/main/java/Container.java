/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Container {
    private int amount;
    
    public Container(){
        this.amount = 0;
    }
    
    public int contains(){
        // amount of liquid in container
        return this.amount;
    }
    
    public void add(int amount){
        // add given amount to container, cannot be > 100
        if (amount > 0){
            this.amount += amount;
        }
        if (this.amount > 100){
            this.amount = 100;
        }
    }
    
    public void remove(int amount){
        // remove amount from container, cannot be < 0
        if (amount > 0){
            this.amount -= amount;
        }
        if (this.amount < 0){
            this.amount = 0;
        }
        
    }
    
    public String toString(){
        // amount of liquid/100
        
        return this.amount + "/100";
    }
    
}

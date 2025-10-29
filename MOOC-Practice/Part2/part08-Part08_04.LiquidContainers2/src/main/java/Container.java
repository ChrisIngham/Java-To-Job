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
    
    private int contain;
    
    public Container(){
        this.contain = 0;
    }
    
    public int contains(){
        return this.contain;
    }
    
    public void add(int amount){
        // has to be > 0 & total cannot be > 100
        if (amount > 0){
            this.contain += amount;
        }
        
        if (this.contain > 100){
            this.contain = 100;
        }
    }
    
    public void remove(int amount){
        // has to be > 0 & total cannot be < 0
        if (amount > 0){
            this.contain -= amount;
        }
        if (this.contain < 0){
            this.contain = 0;
        }
    }
    
    public String toString(){
        return this.contain + "/100";
    }
}

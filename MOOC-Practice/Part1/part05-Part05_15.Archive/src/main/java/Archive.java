/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Archive {
    private String iden;
    private String name;
    
    public Archive (String iden, String name){
        this.iden = iden;
        this.name = name;
    }
    
    public String toString(){
        return this.iden + ": " + this.name;
    }
    
    public boolean equals (Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Archive)){
            return false;
        }
        
        Archive newWhatever = (Archive) compared;
        
        if (this.iden.equals(newWhatever.iden)){
            return true;
        }
        else{
            return false;
        }
    }
}

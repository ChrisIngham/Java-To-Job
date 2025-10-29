
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Abbreviations {
    
    private HashMap<String, String> abbrevs;
    
    public Abbreviations(){
        this.abbrevs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explaination){
        // add new abbreviation and explaination
        if (!(this.abbrevs.containsKey(abbreviation))){
            this.abbrevs.put(abbreviation, explaination);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.abbrevs.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        // return explaination for key
        // null if nothing
        return this.abbrevs.get(abbreviation);
        
    }

}

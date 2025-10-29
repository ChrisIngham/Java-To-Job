
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
public class IOU {
    
    private HashMap<String,Double> iouObj;
    
    public IOU(){
        this.iouObj = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        // saves money someone owes
        if (!(this.iouObj.containsKey(toWhom))){
            this.iouObj.put(toWhom, amount);
        }
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.iouObj.getOrDefault(toWhom, 0.0);
    }
}

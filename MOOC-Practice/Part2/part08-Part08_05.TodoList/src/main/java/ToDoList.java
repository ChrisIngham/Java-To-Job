
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class ToDoList {
    
    private ArrayList<String> items;
    
    public ToDoList(){
        this.items = new ArrayList<>();
        
    }
    
    public void add(String task){
        this.items.add(task);
    }
    
    public void print(){
        int counter = 1;
        for (String stuff : this.items){
            System.out.println(counter + ": " + stuff);
            counter++;
        }
    }
    
    public void remove(int number){
        this.items.remove(number - 1);
    }
}

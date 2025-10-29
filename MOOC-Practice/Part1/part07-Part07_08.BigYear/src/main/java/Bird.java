
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
public class Bird {

    private String birdName;
    private String latinName;
    private int observed;

    public Bird(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName() {
        return this.birdName;
    }

    public void observe() {
        this.observed++;
    }

    public String name() {
        return getName();
    }

    public void observation() {
        observe();
    }

    public String toString() {
        //Hawk (Dorkus Dorkus): 2 observations
        return this.birdName + " (" + this.latinName + "): " + this.observed + " observations";
    }
}

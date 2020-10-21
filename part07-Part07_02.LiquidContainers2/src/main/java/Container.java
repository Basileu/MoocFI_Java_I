/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Container {
    int liquidVolume;
    public Container() {
        liquidVolume = 0;
    }

    public int contains() {
        return liquidVolume;
    }
    public void add(int amount) {
        liquidVolume += (amount > 0) ? amount : 0;
        if (liquidVolume > 100)
            liquidVolume = 100;
    }
    public void remove(int amount) {
        liquidVolume -= (amount > 0) ? amount : 0;
        if (liquidVolume < 0)
            liquidVolume = 0;        
    }
    public String toString() {
        return (liquidVolume + "/100");
    }
}

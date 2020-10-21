/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        value = 0;
    }
    
    public void increase() {
        this.value++;
        if (this.value >= 5) {
            this.value = 5;
        }        
    }
    public void decrease() {
        this.value--;
        if (this.value <= 0) {
            this.value = 0;
        }
    }
    public int value() {
        return this.value;
    }
    public boolean full() {
        if (this.value == 5) {
            return true;
        } else {
            return false;
        }
    }
}

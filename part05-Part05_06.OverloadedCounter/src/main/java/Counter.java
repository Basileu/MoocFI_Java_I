/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Counter {

    private int counter;

    public Counter() {
        counter = 0;
    }

    public Counter(int val) {
        counter = val;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        ++counter;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            counter += increaseBy;
        }
    }

    public void decrease() {
        --counter;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            counter -= decreaseBy;
        }
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Stack {
    private ArrayList<String> myArray;
    
    public Stack() {
        myArray = new ArrayList<>();
    }
    public boolean isEmpty() {
        return (myArray.isEmpty());
    }
    public void add(String value) {
        myArray.add(value);
    }
    public ArrayList<String> values() {
        return myArray;
    }
    public String take() {
//        System.out.println("take called");
        String last = myArray.get(myArray.size() -1);
        myArray.remove(last);
        return last;
    }
}

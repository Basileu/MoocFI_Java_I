
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
public class TodoList {

    private ArrayList<String> myTodoList;

    public TodoList() {
        myTodoList = new ArrayList<>();
    }

    public void add(String task) {
        myTodoList.add(task);
    }

    // prints the exercises. 
    //Each task has a number associated with it on the print statement — use the task's index here (+1).
    public void print() {
        for (int i = 0; i < myTodoList.size(); i++) {
            System.out.println(i+1 + ": " + myTodoList.get(i));
        }
    }
    public void remove(int number) {
        myTodoList.remove(number -1);
    }
}

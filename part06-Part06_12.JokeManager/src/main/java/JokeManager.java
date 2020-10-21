
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class JokeManager {

    private ArrayList<String> myList;

    public JokeManager() {
        myList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        myList.add(joke);
    }

    public String drawJoke() {
        if (myList.isEmpty()) {
            return "Jokes are in short supply.";
        }
//        int rand = (int)(Math.random()%myList.size());
//        return myList.get(rand);
        Random draw = new Random();
        int index = draw.nextInt(myList.size());
        return (myList.get(index));
    }

    public void printJokes() {
        for (String string : myList) {
            System.out.println(string);
        }
    }
}

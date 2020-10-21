
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
public class Room {

    private ArrayList<Person> myList;

    public Room() {
        myList = new ArrayList<>();
    }

    public void add(Person person) {
        myList.add(person);
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return myList;
    }

    public Person shortest() {
        if (myList.isEmpty()) {
            return null;
        }
        Person shortestPers = myList.get(0);
        for (Person person : myList) {
            if (person.getHeight() < shortestPers.getHeight()) {
                shortestPers = person;
            }
        }
        return shortestPers;
    }
    public Person take() {
        Person persToRet = this.shortest();
        myList.remove(persToRet);
        return persToRet;
    }
}

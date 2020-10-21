
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
public class Suitcase {

    private ArrayList<Item> myList;
    private int maxWeight;
    private int totalWeight = 0;

    public Suitcase(int maxWeight) {
        myList = new ArrayList<>();
        this.maxWeight = maxWeight;
        totalWeight = 0;
    }

    public void addItem(Item item) {
        if (totalWeight + item.getWeight() <= maxWeight) {
            totalWeight += item.getWeight();
            myList.add(item);
        }
    }
    @Override
    public String toString() {
//        x items (y kg)
        if (myList.size() == 0)
            return "no items (0 kg)";
        else if (myList.size() == 1)
            return (myList.size() + " item (" + totalWeight + " kg)");
        else
            return (myList.size() + " items (" + totalWeight + " kg)");
//        return "mumu";
    }
    public void printItems() {
        for (Item item : myList) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        return totalWeight;
    }
    public Item heaviestItem() {
        if (myList.isEmpty())
            return null;
        
        Item myItem = myList.get(0);
        for (Item item : myList) {
            if (item.getWeight() > myItem.getWeight())
                myItem = item;
        }
        return myItem;
    }

}

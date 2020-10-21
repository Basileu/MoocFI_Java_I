
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> myList;
    private int totalWeigth;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        totalWeigth = 0;
        myList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeigth + suitcase.totalWeight() <= maxWeight) {
            totalWeigth += suitcase.totalWeight();
            myList.add(suitcase);
        }
//        System.out.println(myList);
    }

    public String toString() {
//        "x suitcases (y kg)"
        return (myList.size() + " suitcases (" + totalWeigth + " kg )");
    }
    
//    prints all the items contained in the hold's suitcases.
    public void printItems() {
        for (Suitcase suitcase : myList) {
            suitcase.printItems();
        }
    }
}

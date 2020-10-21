
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
public class Package {
    private ArrayList<Gift> myList;

    public Package() {
        myList = new ArrayList<>();
    }
    public void addGift(Gift gift) {
        myList.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift : myList) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        balance = openingBalance;
    }
    @Override
    public String toString() {
        // write code here
        String retStr = "The card has a balance of " + balance + " euros";
        return retStr;
    }

    public void eatAffordably() {
        // write code here
        if (balance - 2.6 >= 0) {
            balance -= 2.6;
        }
    }

    public void eatHeartily() {
        // write code here
        if (balance - 4.6 >= 0) {
            balance -= 4.6;
        }

    }

    public void addMoney(double amount) {
        // write code here
        if (amount >=0 ) {
            balance += amount;
        }
        if (balance >= 150) 
            balance = 150;
    }
}

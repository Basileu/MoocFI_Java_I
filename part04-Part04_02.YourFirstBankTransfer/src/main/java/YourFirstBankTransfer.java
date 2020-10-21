
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account myAccount1 = new Account("Matthews account", 1000);
        Account myAccount2 = new Account("My account", 0);
        myAccount1.withdrawal(100);
        myAccount2.deposit(100);
        System.out.println(myAccount1);
        System.out.println(myAccount2);
    }
}

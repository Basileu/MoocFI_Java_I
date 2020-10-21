
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class UserInterface {

    private TodoList myList;
    private Scanner myScanner;

    public UserInterface(TodoList myList, Scanner myScanner) {
        this.myList = myList;
        this.myScanner = myScanner;
    }

    // start the interface
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = myScanner.nextLine();
            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = myScanner.nextLine();
                myList.add(task);

            } else if (command.equals("list")) {
                myList.print();
            } else if (command.equals("remove")){
                System.out.println("Which one is removed? ");
                int id = Integer.valueOf(myScanner.nextLine());
                myList.remove(id);
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}

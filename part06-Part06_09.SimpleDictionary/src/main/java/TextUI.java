
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class TextUI {

    private Scanner myScanner;
    private SimpleDictionary myDictionary;

    public TextUI(Scanner myScanner, SimpleDictionary myDictionary) {
        this.myScanner = myScanner;
        this.myDictionary = myDictionary;
    }

    public void start() {
        String word;
        String translation;

        System.out.println("Command: ");
        while (true) {
            String inputStr = myScanner.nextLine();

            if (inputStr.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (inputStr.equals("add")) {
                System.out.println("Word: ");
                word = myScanner.nextLine();
                System.out.println("Translation: ");
                translation = myScanner.nextLine();
                myDictionary.add(word, translation);
            } else if (inputStr.equals("search")) {
                System.out.println("To be translated: ");
                word = myScanner.nextLine();
                translation = myDictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {

                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        Scanner addScanner = new Scanner(System.in);

        addScanner.close();
    }
}

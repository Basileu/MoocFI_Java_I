
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> myBirdsList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                myBirdsList.add(new Bird(latinName, name));
//                System.out.println(myBirdsList);
                Collections.sort(myBirdsList, (a, b) -> a.getEnglishName().compareTo(b.getEnglishName()));
//                System.out.println(myBirdsList);

            } else if (command.equals("All")) {
                for (Bird bird : myBirdsList) {
                    System.out.println(bird);
                }
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                int index = Collections.binarySearch(myBirdsList, new Bird(name, name),
                        (a, b) -> a.getEnglishName().compareTo(b.getEnglishName()));
                if (index >= 0) {
                    myBirdsList.get(index).incNrObservations();
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                int index = Collections.binarySearch(myBirdsList, new Bird(name, name),
                        (a, b) -> a.getEnglishName().compareTo(b.getEnglishName()));
                if (index >= 0) {
                    System.out.println(myBirdsList.get(index));
                } else {
                    System.out.println("Not a bird!");
                }                
            }

        }
    }

}

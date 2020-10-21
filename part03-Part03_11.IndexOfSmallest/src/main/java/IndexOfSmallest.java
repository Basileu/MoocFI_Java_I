
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        List<Integer> myList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int nr = 0;

        do {
            nr = Integer.valueOf(scan.nextLine());
            myList.add(nr);
        } while (nr != 9999);

        int sizeList = myList.size();
        int smallest = myList.get(0);

        for (int i = 1; i < sizeList; i++) {
            if (smallest > myList.get(i)) {
                smallest = myList.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < sizeList; i++) {
            if (smallest == myList.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
        scan.close();
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for? ");
        int nr = Integer.valueOf(scanner.nextLine());
//        int index = list.indexOf(nr); 
//        if (index != -1) {
//            System.out.println(nr + " is at index " + index);
//        }
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            if (list.get(i) == nr) {
                System.out.println(nr + " is at index " + i);
            }
        }
    }
}

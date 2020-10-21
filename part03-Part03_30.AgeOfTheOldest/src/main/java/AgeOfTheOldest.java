
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        String str = null;
        do {
            str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            String arr[] = str.split(",");
            myList.add(Integer.valueOf(arr[1]));
        } while (!str.equals(""));
        
        if (myList.size() > 0) {
            Collections.sort(myList);
            System.out.println("Age of the oldest: " + myList.get(myList.size() - 1));
        } 
    }
}

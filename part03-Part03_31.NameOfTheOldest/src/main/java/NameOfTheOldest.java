
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        Map<String, Integer> myMap = new HashMap<>();

        String str = null;
        do {
            str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String arr[] = str.split(",");
            myList.add(Integer.valueOf(arr[1]));
            myMap.put(arr[0], Integer.valueOf(arr[1]));
        } while (!str.equals(""));

        if (myList.size() > 0) {
            Collections.sort(myList);
            // System.out.println("Age of the oldest: " + myList.get(myList.size() - 1));
            int indexOldestAge = myList.get(myList.size() - 1);
            Set<String> keys = new HashSet<>();

            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                if (entry.getValue() == indexOldestAge) {
                    System.out.println("Name of the oldest: " + entry.getKey());
                    break;
                }
            }

        }

    }
}

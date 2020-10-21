
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Archive {

    private String ID;
    private String value;
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> myMap = new HashMap<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String ID = scanner.nextLine();
            if (ID.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String value = scanner.nextLine();
            if (value.isEmpty()) {
                break;
            }
            if (!myMap.containsKey(ID)) {
                myMap.put(ID, value);
            }
        }
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
//            System.out.println(value);

        }

    }
}

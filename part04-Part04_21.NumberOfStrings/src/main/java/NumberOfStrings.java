
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
        while (true) {
            String readStr = scanner.nextLine();
            
            if (readStr.equals("end"))
                break;
            
            myList.add(readStr);
        }
        System.out.println(myList.size());
    }
}

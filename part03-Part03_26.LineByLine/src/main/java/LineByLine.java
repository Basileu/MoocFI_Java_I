
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        do {            
            str = scanner.nextLine();
            String arr[] = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } while (!str.equals(""));

    }
}

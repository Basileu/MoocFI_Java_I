
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        do {
            str = scanner.nextLine();
            String arr[] = str.split(" ");
            System.out.println(arr[arr.length-1]);
        } while (!str.equals(""));


    }
}

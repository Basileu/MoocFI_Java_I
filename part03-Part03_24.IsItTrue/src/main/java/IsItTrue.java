
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String str = scanner.nextLine();
        if (str.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}

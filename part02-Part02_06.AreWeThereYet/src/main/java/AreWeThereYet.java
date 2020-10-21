
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = 0;
        do {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
        } while (nr != 4);
    }
}

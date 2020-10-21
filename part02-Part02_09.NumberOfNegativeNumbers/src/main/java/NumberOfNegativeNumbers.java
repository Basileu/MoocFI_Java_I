
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        int nr = 0;
        do {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
            if (nr < 0) {
                ++cnt;
            }

        } while (nr != 0);
        System.out.println("Number of negative numbers: " + cnt);
    }
}

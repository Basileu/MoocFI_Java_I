
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nr = 0;
        do {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
            if (nr != 0) {
                sum += nr;
            }

        } while (nr != 0);
        System.out.println("Sum of the numbers: " + sum);
    }
}

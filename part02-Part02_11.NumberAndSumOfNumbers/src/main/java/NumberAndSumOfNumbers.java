
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nr = 0;
        int cnt = 0;
        do {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
            if (nr != 0) {
                ++cnt;
            }
            sum += nr;
        } while (nr != 0);
        System.out.println("Number of numbers: " + cnt);
        System.out.println("Sum of the numbers: " + sum);
    }
}

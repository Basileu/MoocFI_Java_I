
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = Integer.valueOf(scanner.nextLine());
        System.out.println((int)(Math.pow(var, 2)));

        scanner.close();

    }
}

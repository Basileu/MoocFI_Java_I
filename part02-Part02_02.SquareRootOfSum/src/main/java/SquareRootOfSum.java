
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = Integer.valueOf(scanner.nextLine());
        int var2 = Integer.valueOf(scanner.nextLine());
        System.out.println((int)Math.sqrt(var1 + var2));
        scanner.close();
    }
}

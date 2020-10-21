
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        System.out.println("Give a number: ");

        int nrStop = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        for (int i = 1; i <= nrStop; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}

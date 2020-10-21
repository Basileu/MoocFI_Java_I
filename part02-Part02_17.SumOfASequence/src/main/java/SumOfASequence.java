
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Last number? ");
        int nrStop = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        for (int i = 1; i <= nrStop; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

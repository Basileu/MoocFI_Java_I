
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("First number? ");
        int nrStart = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int nrStop = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int i = nrStart; i <= nrStop; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}

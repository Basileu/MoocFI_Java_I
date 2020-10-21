
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nr = 0;
        int cnt = 0;
        double average = 0;
        do {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
            if (nr > 0) {
                ++cnt;
                sum += nr;
            }
            
        } while (nr != 0);
        if (cnt > 0) {
            average = (double)sum/cnt;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
        
        
    }
}

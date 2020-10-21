
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        // Write your program here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int nr = 0;
        int sum = 0;
        int cnt = 0;
        int cntOdd = 0;
        int cntEven = 0;

        while (true) {
            nr = Integer.valueOf(scanner.nextLine());
            if (nr == -1) {
                break;
            }
            sum += nr;
            ++cnt;
            if (nr % 2 == 0) {
                ++cntEven;
            } else {
                ++cntOdd;
            }
        }
        System.out.println("Thx! Bye!");
        if (cnt > 0) { 
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + cnt);
            System.out.println("Average: " + (double)sum/cnt);
            System.out.println("Even: " + cntEven);
            System.out.println("Odd: " + cntOdd);
        }
    }
}

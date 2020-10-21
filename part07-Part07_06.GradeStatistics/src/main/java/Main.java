
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point myPoint = new Point();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            myPoint.addPoints(input);

        }
        System.out.println("Point average (all): " + myPoint.calculateAverage());
        double avg = myPoint.calculatePassingAverage();
        System.out.println("Point average (passing): " + ((avg > 0) ? Double.toString(avg): "-"));
        System.out.println("Pass percentage: " + myPoint.calculatePassPercentage());
        myPoint.gradeDisti();
        
    }
}

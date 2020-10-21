
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int readInteger;
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statisticsTotal = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            readInteger = Integer.valueOf(scanner.nextLine());
            if (readInteger <= -1) {
                break;
            } else {
                statisticsTotal.addNumber(readInteger);
                if (readInteger % 2 == 0) {
                    statisticsEven.addNumber(readInteger);
                } else {
                    statisticsOdd.addNumber(readInteger);
                }
            }
        }
        
        System.out.println("Sum: " + statisticsTotal.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}

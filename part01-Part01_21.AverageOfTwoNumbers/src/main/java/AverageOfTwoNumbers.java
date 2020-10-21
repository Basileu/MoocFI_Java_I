
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the third number:");
        // int thirdNum = Integer.valueOf(scanner.nextLine());
        // System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));
        System.out.println("The average is " + ((float) (firstNum+secondNum)/2));

        scanner.close();
    }
}

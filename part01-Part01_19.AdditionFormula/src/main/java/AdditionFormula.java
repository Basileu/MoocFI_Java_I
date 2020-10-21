
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the third number:");
        // int thirdNum = Integer.valueOf(scanner.nextLine());
        // System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));
        System.out.println(firstNum + " + "+ secondNum + " = " + (firstNum+secondNum));

        scanner.close();

    }
}

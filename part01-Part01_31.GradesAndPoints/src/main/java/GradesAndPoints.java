
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int firstNum = Integer.valueOf(scan.nextLine());

        if (firstNum < 0) {
            System.out.println("Grade: impossible!");
        } else if (firstNum <= 49) {
            System.out.println("Grade: failed");
        } else if (firstNum <= 59) {
            System.out.println("Grade: 1");
        } else if (firstNum <= 69) {
            System.out.println("Grade: 2");
        } else if (firstNum <= 79) {
            System.out.println("Grade: 3");
        } else if (firstNum <= 89) {
            System.out.println("Grade: 4");
        } else if (firstNum <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
        
        scan.close();        
    }
}

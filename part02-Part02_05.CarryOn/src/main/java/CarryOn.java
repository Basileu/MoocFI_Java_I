
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = null;
        
        do {
            System.out.println("Shall we carry on?");
            inStr = scanner.nextLine();
        } while (!inStr.equals("no"));
    }
}

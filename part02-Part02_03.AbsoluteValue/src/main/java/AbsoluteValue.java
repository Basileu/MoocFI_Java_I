
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = Integer.valueOf(scanner.nextLine());
        
        if (var1 < 0) {
            System.out.println(var1*(-1));
        } else {
            System.out.println(var1);
        }
    }
}

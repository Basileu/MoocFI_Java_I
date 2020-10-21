
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var1 = Integer.valueOf(scanner.nextLine());
        int var2 = Integer.valueOf(scanner.nextLine());
        if (var1 > var2) {
            System.out.println(var1 + " is greater than " + var2 + ".");
        } else if (var2 > var1){
            System.out.println(var1 + " is smaller than " + var2 + ".");
        } else {
            System.out.println(var1 + " is equal to " + var2 + ".");
        }
    }
}

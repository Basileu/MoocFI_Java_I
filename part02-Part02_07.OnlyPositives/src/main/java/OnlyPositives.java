
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = 0;
        while (true) {
            System.out.println("Give a number:");
            nr = Integer.valueOf(scanner.nextLine());
            if (nr < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (nr == 0) {
                break;
            }
            System.out.println(Math.pow(nr, 2));
        }
    }
}

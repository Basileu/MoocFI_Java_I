
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String readStr = scanner.nextLine();
            
            if (readStr.equals("end"))
                break;
            
            int nr = Integer.valueOf(readStr);
            System.out.println((int)Math.pow(nr, 3));
        }
    }
}

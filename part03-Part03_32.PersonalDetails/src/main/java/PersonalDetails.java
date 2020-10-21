
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String name = "";
        int nameLengthOld = -1;
        int sum = 0;
        int cnt = 0;

        String newName = null;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            int nameLengthNew = parts[0].length();
            if (nameLengthNew > nameLengthOld) {
                nameLengthOld = nameLengthNew;
                // name = parts[0];
                newName = parts[0];
            }
            sum += age;
            ++cnt;
        }

        System.out.println("Longest name: " + newName);
        System.out.println("Average of the birth years: " + (double) sum / cnt);

    }
}

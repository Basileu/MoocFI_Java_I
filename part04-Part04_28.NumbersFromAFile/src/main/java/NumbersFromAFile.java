
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int cntNrInRange = 0;
        int nr = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                nr = Integer.valueOf(fileScanner.nextLine());
                if (nr >= lowerBound && nr <= upperBound)
                    ++cntNrInRange;
            }
        } catch (Exception e) {
            System.out.println("Exception caught on file " + file 
                                + "with message " + e.getMessage());
        }
        System.out.println("Numbers: /...." + cntNrInRange);

    }

}

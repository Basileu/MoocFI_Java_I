
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] strArr = fileScanner.nextLine().split(",");
                System.out.println(strArr[0] + ", age: " + strArr[1] + " years");
            }
        } catch (Exception e) {
        }
    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

//        ArrayList<String> list = new ArrayList<>();
        boolean stringFound = false;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals(searchedFor)) {
                    System.out.println("Found!");
                    stringFound = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (!stringFound)
            System.out.println("Not found.");
        
    }
}

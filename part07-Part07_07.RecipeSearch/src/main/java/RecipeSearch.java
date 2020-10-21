
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");

        String path = scanner.nextLine();
        RecipesBook myBook = new RecipesBook(path);

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                myBook.listRecipies();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                myBook.searchByName(word);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                myBook.searchByCookingTime(time);
            }else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                myBook.searchByIngredient(ingredient);
            }
        }

    }

}

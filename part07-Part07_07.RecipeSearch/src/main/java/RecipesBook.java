
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class RecipesBook {

    private ArrayList<Recipe> listRecipies;

    public RecipesBook(String path) {
        listRecipies = new ArrayList<>();
        String nameRecipe = null;
        int cookTime = 0;
        ArrayList<String> ingredients;
//        System.out.println(path);

//        try (Scanner scan = new Scanner(Paths.get("recipes.txt"))) {
        try (Scanner scan = new Scanner(Paths.get(path))) {
            while (scan.hasNextLine()) {
//                System.out.println(scan.nextLine());
                boolean nameRead = false;
                boolean timeRead = false;
                ingredients = new ArrayList<>();
                
                while (true) {

                    
//                    String line = scan.nextLine();
                    String line = null;
                    try {
                        line = scan.nextLine();
                    } catch (Exception e) {
                        break;
                    }
//                    System.out.println("line = " + line);
                    if (line.equals("")) {
//                        System.out.println("line equals \"\"");
                        break;
                    } else if (nameRead == false) {
//                        System.out.println("assigning name");
                        nameRecipe = line;
                        nameRead = true;
                    } else if (timeRead == false) {
//                        System.out.println("assigning time");
                        cookTime = Integer.valueOf(line);
                        timeRead = true;
                    } else {
                        ingredients.add(line);
                    }
                }

                if (nameRecipe != null && cookTime != 0) {
                    listRecipies.add(new Recipe(nameRecipe, cookTime, ingredients));
//                    System.out.println("adding to the slist...");
                }

            }
        } catch (Exception e) {
            System.out.println("exception caught " + e.getMessage());
        }
    }

    public void listRecipies() {
        System.out.println("Recipes:");
        for (Recipe listRecipy : listRecipies) {
            System.out.println(listRecipy.getName() + ", cooking time: " + listRecipy.getCookingTime());
        }
    }

    public void searchByName(String name) {
        Collections.sort(listRecipies, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("Recipes: ");
        for (Recipe listRecipy : listRecipies) {
            if (listRecipy.getName().contains(name)) {
                System.out.println(listRecipy.getName() + ", cooking time: " + listRecipy.getCookingTime());
            }
        }
    }

    public void searchByCookingTime(int time) {
        Collections.sort(listRecipies, (a, b) -> a.getCookingTime() - b.getCookingTime());
        System.out.println("Recipes: ");
        for (Recipe listRecipy : listRecipies) {
            if (listRecipy.getCookingTime() <= time) {
                System.out.println(listRecipy.getName() + ", cooking time: " + listRecipy.getCookingTime());
            }
        }
    }

    public void searchByIngredient(String ingred) {
//        Collections.sort(listRecipies, (a, b) -> a.getCookingTime() - b.getCookingTime());
        System.out.println("Recipes: ");
        for (Recipe listRecipy : listRecipies) {
//            System.out.println(listRecipy.getName());
            for (String ingredient : listRecipy.getIngredients()) {
//                System.out.println("String ingredient = " + ingredient);
                if (ingredient.equals(ingred)) {
                    System.out.println(listRecipy.getName() + ", cooking time: " + listRecipy.getCookingTime());
                } else {
                    
                }
            }
        }
    }

}

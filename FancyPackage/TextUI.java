package FancyPackage;


import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class TextUI {

    private Scanner scanner = new Scanner(System.in);
    private RecipeList recipeList = new RecipeList();

    public TextUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Scanner inputScanner = new Scanner(System.in);
//        System.out.print("File to read: ");
//        String fileNameToBeFound = inputScanner.nextLine();
        parseFile("recipes.txt");
        commands();

    }

    public void commands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        while (true) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter command: ");
            String command = inputScanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipeList.printRecipes();
            }
        }
    }

    public void parseFile(String fileNameToBeFound) {
        String recipeName = "";
        int cookingTime = 0;
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileNameToBeFound))) {

            // read next line if it exists
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                // if the line starts with whitespace, it's time to seperate into a new recipeName. Let's add the previous details into a new recipe
                // and clear the current ingredients list for a new recipe
                if (row.isEmpty()) {
                    Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
                    recipeList.addRecipe(recipe);
                    ingredients = new ArrayList<>(); // why doesn't ingredients.clear() work as intended here? 
                    continue;
                }

                // if the line starts with uppercase character, it's a recipeName
                if (Character.isUpperCase(row.charAt(0))) {
                    recipeName = row;
                }

                // if the line starts with a digit, it's a cookingTime for a recipeName
                if (Character.isDigit(row.charAt(0))) {
                    cookingTime = Integer.valueOf(row);
                    //continue;
                }

                // if the line starts with a lowercase character, it's an ingredient
                if (Character.isLowerCase(row.charAt(0))) {
                    ingredients.add(row);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

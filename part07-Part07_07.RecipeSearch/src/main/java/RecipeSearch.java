
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // variables needed
        String recipeName = "";
        int cookingTime;
        ArrayList<String> ingredients = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner fileScanner = new Scanner(Paths.get("recipes.txt"))) {

            while (fileScanner.hasNextLine()) {

                // we read one line
                String row = fileScanner.nextLine();

                // we analyse the line that we read:
                // if row is empty, it's the start of a new recipe OR the end of the file
                if (row.isBlank()) {
                    row = fileScanner.nextLine();
                }

                // if row starts with Uppercase, it's a recipeName
                if (Character.isUpperCase(row.charAt(0))) {
                    recipeName = row;
                    System.out.println(recipeName + " is a recipeName");
                }

                // if a row starts with a digit, it's a cookingTime
                if (Character.isDigit(row.charAt(0))) {
                    cookingTime = Integer.valueOf(row);
                    System.out.println(cookingTime + " is a cookingTime for " + recipeName);
                }

                // if a row starts with Lowercase, it's an ingredient
                if (Character.isLowerCase(row.charAt(0))) {
                    ingredients.add(row);
                    System.out.println("List of ingredients: " + ingredients);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

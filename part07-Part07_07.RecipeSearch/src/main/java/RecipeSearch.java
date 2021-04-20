
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // we create a scanner for reading user input
        Scanner inputScanner = new Scanner(System.in);

        // we ask the user what file to read, set it to only recipes.txt initially for testing purposes
//        System.out.print("File to read: ");
//        String fileName = inputScanner.nextLine();
        // variables needed for parsing the file
        String recipeName = "";
        int cookingTime;
        ArrayList<String> ingredients = new ArrayList<>();

        // we create a scanner for reading the file, set it to read recipes.txt initially for testing purposes
//        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
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
//                    System.out.println(recipeName + " is a recipeName");
                }

                // if a row starts with a digit, it's a cookingTime
                if (Character.isDigit(row.charAt(0))) {
                    cookingTime = Integer.valueOf(row);
                    System.out.println(recipeName + ", cooking time: " + cookingTime);
                }

                // if a row starts with Lowercase, it's an ingredient
                if (Character.isLowerCase(row.charAt(0))) {
                    ingredients.add(row);
//                    System.out.println("List of ingredients: " + ingredients);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // text UI for main program
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("");

        // enter command loop
        while (true) {
            System.out.print("Enter command: ");
            String command = inputScanner.nextLine();

            if (command.equals("list")) {
//                for (int i = 0; i < recipes.size(); i++) {
//                    System.out.println(recipes.getRecipeName(i) + ", cooking time: " + recipes.getCookingTime(i));
//                }
            }

            if (command.equals("stop")) {
                break;
            }
        }

    }

}

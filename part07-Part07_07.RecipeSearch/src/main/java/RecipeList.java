
import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList = new ArrayList<>();

    public RecipeList() {
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public void printRecipes() {
        for (Recipe iteratedRecipe : recipeList) {
            System.out.println(iteratedRecipe);
        }
    }

    public void findRecipeByName(String searchedWord) {
        System.out.println("\nRecipes: ");
        for (Recipe iteratedRecipe : recipeList) {
            if (iteratedRecipe.getRecipeName().contains(searchedWord)) {
                System.out.println(iteratedRecipe);
            }
        }
    }

    public void findRecipeByMaxCookingTime(int maxCookingTime) {
        System.out.println("\nRecipes: ");
        for (Recipe iteratedRecipe : recipeList) {
            if (iteratedRecipe.getCookingTime() <= maxCookingTime) {
                System.out.println(iteratedRecipe);
            }
        }
    }

    public void findRecipeByIngredient(String ingredientToFind) {
        System.out.println("\nRecipes: ");
        for (Recipe iteratedRecipe : recipeList) {
            if (iteratedRecipe.getIngredients().contains(ingredientToFind)) {
                System.out.println(iteratedRecipe);
            }
        }
    }
}

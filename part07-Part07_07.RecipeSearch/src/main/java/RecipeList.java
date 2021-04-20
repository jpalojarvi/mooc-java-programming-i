
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
    
    
    
}

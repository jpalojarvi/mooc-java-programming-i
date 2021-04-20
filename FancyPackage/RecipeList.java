package FancyPackage;


import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

//    public ArrayList<Recipe> getRecipes() {
//        return this.recipes;
//    }
    
    public void printRecipes(){
        for (int i = 0; i < this.recipes.size(); i++){
            System.out.println(this.recipes.get(i));
        }
    }

//    @Override
//    public String toString() {
//        return "" + recipes.get(1);
//    }
    
    


}

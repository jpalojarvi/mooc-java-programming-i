package FancyPackage;


import java.util.ArrayList;

//
//import java.util.ArrayList;
//
//public class Recipe {
//
//    private String recipeName;
//    private int cookingTime;
//    private ArrayList<String> ingredients = new ArrayList<>();
//    private ArrayList<Recipe> recipes = new ArrayList<>();
//
//    public Recipe() {
//        
//    }
//    public Recipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {
//        this.recipeName = recipeName;
//        this.cookingTime = cookingTime;
//        this.ingredients = ingredients;
//    }
//
//
//
//    public String getRecipeName() {
//        return recipeName;
//    }
//
//    public int getCookingTime() {
//        return cookingTime;
//    }
//
//    public ArrayList<String> getIngredients() {
//        return ingredients;
//    }
//
//    public void addRecipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {
//        Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
//        recipes.add(recipe);
//    }
//
//}

public class Recipe {
    
    private ArrayList<Recipe> recipes;
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(){
        this.recipes = new ArrayList<>();
    }

    public Recipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public void addRecipeToList(Recipe recipe) {
        recipes.add(recipe);
    }

//    public String getRecipeName() {
//        return recipeName;
//    }
//
//    public int getCookingTime() {
//        return cookingTime;
//    }
//
//    public ArrayList<String> getIngredients() {
//        return ingredients;
//    }
    

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
    
    
}
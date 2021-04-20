
public class Recipe {
    private String recipeName;
    private int cookingTime;
    
    public Recipe(String recipeName, int cookingTime){
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
    
    
}

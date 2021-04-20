
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName, int ageRating){
        this.name = filmName;
        this.ageRating = ageRating;
    }
    
    public String name(){
        return this.name;
    }
    
    public int ageRating(){
        return this.ageRating;
    }
}

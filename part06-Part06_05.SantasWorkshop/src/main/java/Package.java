
import java.util.ArrayList;


public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        if (this.gifts.isEmpty()){
            return 0;
        }
        
        int sumOfWeights = 0;
        for (Gift per: this.gifts){
            sumOfWeights += per.getWeight();
        }
        return sumOfWeights;
    }
}

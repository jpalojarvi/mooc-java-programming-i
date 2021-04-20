
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> hold = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.hold.add(suitcase);
        }
    }

    public int totalWeight() {

        int totalWeight = 0;
        // checking that the hold isn't empty
        if (!this.hold.isEmpty()) {
            
            // iterating through the hold, adding the iterated suitcase's weight to the hold's total weight
            for (Suitcase iteratedSuitcase : hold) {
                totalWeight += iteratedSuitcase.totalWeight();
            }
        }

        return totalWeight;
    }
    
    public void printItems(){
        // checking that the hold isn't empty
        for (Suitcase iteratedSuitcase: hold){
            iteratedSuitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return this.hold.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

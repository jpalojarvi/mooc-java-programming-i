
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item iteratedItem : items) {
            totalWeight += iteratedItem.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }

        if (this.items.size() > 1) {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }

        return "no items (0 kg)";
    }

    public void printItems() {
        for (Item iteratedItem : items) {
            System.out.println(iteratedItem);
        }
    }

    public Item heaviestItem() {
        // checking that the suitcase isn't empty
        if (!this.items.isEmpty()) {
            // creating a reference item to compare to
            Item heaviestItem = items.get(0);
            
            // iterating through the items and comparing to the reference item
            for (Item iteratedItem : items) {
                if (heaviestItem.getWeight() < iteratedItem.getWeight()) {
                    heaviestItem = iteratedItem;
                }
            }
            return heaviestItem;
        }
        return null;
    }

}

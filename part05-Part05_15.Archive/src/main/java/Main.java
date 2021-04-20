
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(identifier,name);
            
            // now we want to check that the items aren't "equal", e.g. they don't have the same values, even if the Object names are different
            if (itemList.contains(item)){
                System.out.println("The item is already on the list. Let's not add the same item again.");
            } else {
                itemList.add(item);
            }
        }
        
        // after empty input
        System.out.println("==Items==");
        for (Item i: itemList){
            System.out.println(i);
        }

    }
}


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (!this.elements.isEmpty()){
            
            // create an obejct reference for the object to be returned
            // its first value is the first object on the list
            String returnObject = this.elements.get(0);
            
            // go through the list
            for (String iteratedCharacter: this.elements){
                // compare each object on the list to the returnObject -- we compare name lengths
                if (returnObject.length() < iteratedCharacter.length()){
                    returnObject = iteratedCharacter;
                }
            }
            return returnObject;
        }
        // return a null reference if there's nobody on the list
        return null;
    }

}

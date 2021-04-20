
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

    @Override
    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }

        // we form a string from the characters on the list
//        String peopleOnList = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        String printedSet = "";

//        for (int i = 0; i < elements.size(); i++) {
//            peopleOnList += elements.get(i);
//            peopleOnList += "\n";
//        }
        for (String element : elements) {
            printedSet += "\n" + element;
        }
//        return peopleOnList;
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + printedSet;

    }
}

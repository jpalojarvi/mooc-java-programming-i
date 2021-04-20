
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        String removedValue = values.get(values.size()-1);
        values.remove(removedValue);
        return removedValue;
    }
}


import java.util.ArrayList;

public class Room {

    private ArrayList<Person> peopleList = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        this.peopleList.add(person);
    }

    public boolean isEmpty() {
        return this.peopleList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.peopleList;
    }

    public Person shortest() {
        // checking that room isn't empty
        if (!this.peopleList.isEmpty()) {
            // creating reference person to compare to
            Person shortestPerson = this.peopleList.get(0);

            // iterating through list and comparing
            for (Person comparedPerson : peopleList) {
                if (shortestPerson.getHeight() > comparedPerson.getHeight()) {
                    shortestPerson = comparedPerson;
                }
            }

            return shortestPerson;
        }

        // return null if person list is empty
        return null;
    }

    public Person take() {
        // checking that room isn't empty

        if (!this.peopleList.isEmpty()) {
            // creating reference person to return if there's only one person in the room
            Person shortestPerson = this.shortest();
            peopleList.remove(shortestPerson);
            return shortestPerson;
        }
        return null;
    }
}

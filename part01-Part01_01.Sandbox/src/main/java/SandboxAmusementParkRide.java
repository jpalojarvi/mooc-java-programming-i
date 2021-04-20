
import java.util.ArrayList;

public class SandboxAmusementParkRide {

    private String name;
    private int lowestHeight;
    private int visitors;
    private ArrayList<SandboxPerson> riding;

    public SandboxAmusementParkRide(String name, int lowesttHeight) {
        this.name = name;
        this.lowestHeight = lowesttHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean allowedToRide(SandboxPerson person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }
        this.riding.add(person);
        this.visitors++;
        return true;
    }

    @Override
    public String toString() {

        String printOutput = this.name + ", minimum height requirement: " + this.lowestHeight
                + ", visitors: " + this.visitors + "\n";

        if (riding.isEmpty()) {
            return printOutput + "no one is on the ride.";
        }

        // we form a string from the people on the list
        String peopleOnRide = "";

        for (SandboxPerson person : riding) {
            peopleOnRide = peopleOnRide + person.getName() + "\n";
        }

        return printOutput + "\n"
                + "on the ride:\n" + peopleOnRide;
    }

    public void removeEveryoneOnRide() {
        this.riding.clear();
    }

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (SandboxPerson currentlyIteratedPerson : riding) {
            sumOfHeights += currentlyIteratedPerson.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    public SandboxPerson getTallest() {
        // return a null reference if there's no one on the ride
        if (this.riding.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        SandboxPerson returnObject = this.riding.get(0);

        // go through the list
        for (SandboxPerson iteratedPerson : this.riding) {
            // compare each object on the list to the returnObject -- we compare heights since we're searching for the tallest,

            if (returnObject.getHeight() < iteratedPerson.getHeight()) {
                // if we find a taller person in the comparison, we assign it as the value of the returnObject
                returnObject = iteratedPerson;
            }
        }
        return returnObject;
    }
}

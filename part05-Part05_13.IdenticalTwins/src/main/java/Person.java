
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of Persons
    @Override
    public boolean equals(Object comparedObject){
        // if the variables are located in the same position i.e. same location in memory, they are equal
        if (this == comparedObject){
            return true;
        }
        // ^ Is the simplified same version of: return (this == comparedPerson);
        
        // convert the Object-type Object comparedPerson into a Person-type Object so that their values may be compared, as that is the thing we are primarily interested in
        Person comparedPerson = (Person) comparedObject;
        
        // now for the interesting part. If the values of the Person-object values of variables are equal, the Person-objects are equal enough for our comparison. Memory address location and 
        // object name is irrelevant to us in this exercise
        if (this.birthday.equals(comparedPerson.birthday) // SIMPLEDATE.JAVA EQUALS() IS CALLED HERE, BIRTHDAYS (OBJECTS) CAN'T BE COMPARED WITHOUT IT!
                && (this.height == comparedPerson.height)
                && (this.weight == comparedPerson.weight)
                && (this.name.equals(comparedPerson.name))) {
            return true;
        }
        
        return false;
    }
}

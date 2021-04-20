public class Person {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public Person(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    // methods
    @Override
    public String toString(){
        return (this.firstName + " " + this.lastName);
    }
}
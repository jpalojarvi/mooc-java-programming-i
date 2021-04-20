
public class SandboxPerson {

    private String name;
    private SandboxSimpleDate birthday;
    private int weight = 0;
    private int height = 0;


    public SandboxPerson(String name) {
        this.name = name;
    }

    public SandboxPerson(String name, SandboxSimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public SandboxPerson(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SandboxSimpleDate(day, month, year);
    }

    // methods
    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }

    int getHeight() {
        return this.height;
    }

    String getName() {
        return this.name;
    }

    void setWeight(int i) {
        this.weight = i;
    }

    void setHeight(int i) {
        this.height = i;
    }
    
    

    public boolean olderThan(SandboxPerson comparedPerson) {
        // or return more directly,
        // return this.birthday.before(compared.getBirthday());
        
        return this.birthday.before(comparedPerson.birthday);
        
    }

    public Object getBirthday(SandboxPerson person) {
        return this.birthday;
    }

}


public class Bird {

    private String birdName;
    private String birdNameInLatin;
    private int observations;

    public Bird(String nameToAdd, String nameInLatin) {
        this.birdName = nameToAdd;
        this.birdNameInLatin = nameInLatin;
        this.observations = 0;
    }

    public String getName() {
        return birdName;
    }

    public String getBirdNameInLatin() {
        return birdNameInLatin;
    }

    @Override
    public String toString() {
        return this.birdName + " (" + this.birdNameInLatin + "): " + this.observations + " observations";
    }

    public void observe() {
        this.observations++;
    }

}

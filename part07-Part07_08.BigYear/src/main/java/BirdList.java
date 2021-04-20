
import java.util.ArrayList;

public class BirdList {

    private ArrayList<Bird> birdList = new ArrayList<>();

    public BirdList() {
    }

    public void addBird(Bird bird) {
        this.birdList.add(bird);
    }

    public void printBirds() {
        for (Bird iteratedBird : birdList) {
            System.out.println(iteratedBird);
        }
    }

    public void printOneBird(String birdName) {
        if (birdList.size() > 0) {
            System.out.println(findBird(birdName));
        } else {
            System.out.println("No birds added yet!");
        }
    }
    
    public Bird findBird(String birdName){
        for (Bird iteratedBird: birdList){
            if (iteratedBird.getName().equals(birdName) || iteratedBird.getBirdNameInLatin().equals(birdName)){
                return iteratedBird;
            }
        }
        System.out.println("Not a bird!");
        return null;
    }

    public void observeBird(String birdName) {
        if (findBird(birdName) != null){
            findBird(birdName).observe();
        }
                
    }

}

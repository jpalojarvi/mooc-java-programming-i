
import java.util.Scanner;

public class TextUI {

    private Scanner scan = new Scanner(System.in);
    private BirdList birdList = new BirdList();

    public TextUI(Scanner scan) {
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String nameToAdd = scan.nextLine();
                System.out.print("Name in latin: ");
                String nameInLatin = scan.nextLine();
                Bird newBird = new Bird(nameToAdd, nameInLatin);
                birdList.addBird(newBird);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                birdList.observeBird(birdName);
            }

            if (command.equals("All")) {
                birdList.printBirds();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                birdList.printOneBird(birdName);
            }

            if (command.equals("Quit")) {
                break;
            }
        }

    }
}

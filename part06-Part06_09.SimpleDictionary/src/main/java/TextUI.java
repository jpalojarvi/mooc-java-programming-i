
import java.util.Scanner;

public class TextUI {

    private Scanner scanner = new Scanner(System.in);
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        
        // THIS IS ADDING TO THE WRONG DICTIONARY!!! CHECK WITH BREAKPOINTS
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);
                continue;
            }
            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                System.out.println(dictionary.translate(word));
                continue;
            }
            System.out.println("Unknown command");

        }
    }
}

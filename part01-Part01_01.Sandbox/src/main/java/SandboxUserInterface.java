
//import java.util.ArrayList;
import java.util.Scanner;

public class SandboxUserInterface {

    private Scanner scanner;
//    private ArrayList<String> words;
    private SandBoxWordSet wordSet;

    public SandboxUserInterface(SandBoxWordSet wordSet, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = wordSet;
//        this.words = new ArrayList<String>();
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }
            // adding the word to the list of previous words
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
        wordSet.printWords();
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
    }

//    private boolean alreadyEntered(String word) {
//        return this.words.contains(word);
//    }
}

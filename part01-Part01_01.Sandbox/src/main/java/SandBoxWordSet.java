
import java.util.ArrayList;
import java.util.Scanner;

public class SandBoxWordSet {

    private ArrayList<String> words;
//    Scanner scanner = new Scanner(System.in);

    public SandBoxWordSet() {
        this.words = new ArrayList<>();
//        while (true) {
//            String word = scanner.nextLine();
//
//            if (words.contains(word)) {
//
//            }
//        }
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    void printWords() {
        // test print to check that everything still works
        for (String iteratedWord : words) {
            System.out.println(iteratedWord);
        }
    }

    public int palindromes() {
        int count = 0;

        for (String word : this.words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(String word) {
        int end = word.length() - 1;
        
        int i = 0;
        while (i < word.length() / 2){
            // method charAt returns the character at given index as a simple variable
            if (word.charAt(i) != word.charAt(end - i)){
                return false;
            }
            i++;
        }
        
        return true;
    }
}

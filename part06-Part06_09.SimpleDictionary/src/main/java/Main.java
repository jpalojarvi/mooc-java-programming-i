
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together here
        SimpleDictionary dictionary = new SimpleDictionary();
        Scanner scanner = new Scanner(System.in);
        
        dictionary.add("one", "yksi");
        dictionary.add("kaksi", "two");
        
        System.out.println(dictionary.translate("one"));
        System.out.println(dictionary.translate("two"));
        System.out.println(dictionary.translate("three"));
        
        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
        
        
    }
}

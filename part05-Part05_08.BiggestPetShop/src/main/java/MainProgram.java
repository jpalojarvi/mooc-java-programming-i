
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        Person lilo = new Person();
        Person haddock = new Person("Hiccup Horrendous Haddock III");

        System.out.println(leo);
        System.out.println(lilo);
        System.out.println(haddock);
        
    }
}

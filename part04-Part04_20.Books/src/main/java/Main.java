
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed? ");
        String selection = scanner.nextLine();
        if (selection.equals("everything")) {
            for (Book iteratedBook : books) {
                System.out.println(iteratedBook.toString());
            }
        } else if (selection.equals("name")) {
            for (Book iteratedBook : books) {
                System.out.println(iteratedBook.getName());
            }
        }
    }
}

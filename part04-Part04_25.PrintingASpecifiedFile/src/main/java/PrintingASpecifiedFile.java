
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Which file should have its content printed?");
        String fileNameToBeFound = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileNameToBeFound))) {

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

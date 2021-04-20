
import java.util.Scanner;

public class TextUI {

    private Scanner scanner = new Scanner(System.in);
    private Grades grades;

    public TextUI(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                grades.printStatistics();
                break;
            }
            grades.addPoints(points);

        }
    }

}

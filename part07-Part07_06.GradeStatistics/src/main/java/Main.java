
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades grades = new Grades();
        TextUI ui = new TextUI(scanner, grades);
        ui.start();
        
//        int pointsTotalCount = 0;
//        int pointsPassedCount = 0;
//        double pointsTotal = 0;
//        double pointsPassed = 0;
//        
//        while (true) {
//            System.out.println("Enter point totals, -1 stops:");
//            int command = Integer.valueOf(scanner.nextLine());
//            if (command == -1) {
//                System.out.println("Point average (all): " + pointsTotal / pointsTotalCount);
//                System.out.println("Point average (passing): " + pointsPassed / pointsPassedCount);
//                System.out.println("Pass percentage: " + 100 * pointsPassedCount * 1.0 / pointsTotalCount);
//                break;
//            }
//            if (command >= 0 && command <= 100) {
//                pointsTotalCount++;
//                pointsTotal += command;
//                if (command >= 50) { 
//                   pointsPassedCount++;
//                    pointsPassed += command;
//                }
//            }
//
//        }
    }
}

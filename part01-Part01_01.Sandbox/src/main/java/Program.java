
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        ArrayList<Integer> grades = new ArrayList<>();

        register.addGradeBasedOnPoints(51);
        register.addGradeBasedOnPoints(50);
        register.addGradeBasedOnPoints(49);

        System.out.println("Number of students with grade 0 (should be 1): " + register.numberOfGrades(0));
        System.out.println("Number of students with grade 0 (should be 2): " + register.numberOfGrades(2));
        
//        while (true) {
//            System.out.print("Points: ");
//            String input = scanner.nextLine();
//            if (input.equals("")) {
//                break;
//            }
//
//            int score = Integer.valueOf(input);
//
//            if (score < 0 || score > 100) {
//                System.out.println("Impossible number.");
//                continue;
//            }
//
//            register.addGradeBasedOnPoints(score);
//        }
//
//        System.out.println("");
//        int grade = 5;
//        while (grade >= 0) {
//            int stars = register.numberOfGrades(grade);
//            System.out.print(grade + ": ");
//            while (stars > 0) {
//                System.out.print("*");
//                stars--;
//            }
//            System.out.println("");
//
//            grade = grade - 1;
//        }
    }
}


import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (!this.grades.isEmpty()) {
            int sumOfGrades = 0;
            for (int i = 0; i < grades.size(); i++) {
                sumOfGrades += grades.get(i);
            }
            return 1.0 * sumOfGrades / this.grades.size();
        }
        return -1;
    }

    public double averageOfPoints() {
        if (!this.points.isEmpty()) {
            int sumOfPoints = 0;
            for (int i = 0; i < points.size(); i++) {
                sumOfPoints += points.get(i);
            }
            return 1.0 * sumOfPoints / this.points.size();
        }
        return -1;
    }
}

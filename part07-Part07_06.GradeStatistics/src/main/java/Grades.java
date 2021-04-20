
import java.util.ArrayList;

public class Grades {

    int pointsTotalCount = 0;
    int pointsPassedCount = 0;
    double pointsTotal = 0;
    double pointsPassed = 0;

    int gradeFiveCount = 0;
    int gradeFourCount = 0;
    int gradeThreeCount = 0;
    int gradeTwoCount = 0;
    int gradeOneCount = 0;
    int gradeZeroCount = 0;

    public void addPoints(int pointsToAdd) {
        addGrades(pointsToAdd);
        if (pointsToAdd >= 0 && pointsToAdd <= 100) {
            this.pointsTotalCount++;
            this.pointsTotal += pointsToAdd;
            if (pointsToAdd >= 50) {
                pointsPassedCount++;
                pointsPassed += pointsToAdd;
            }
        }
    }

    public void addGrades(int pointsToGrade) {
        if (pointsToGrade >= 0 && pointsToGrade <= 100) {
            if (pointsToGrade < 50) {
                this.gradeZeroCount++;
                return;
            }

            if (pointsToGrade < 60) {
                this.gradeOneCount++;
                return;
            }
            if (pointsToGrade < 70) {
                this.gradeTwoCount++;
                return;
            }
            if (pointsToGrade < 80) {
                this.gradeThreeCount++;
                return;
            }
            if (pointsToGrade < 90) {
                this.gradeFourCount++;
                return;
            }

            if (pointsToGrade >= 90) {
                this.gradeFiveCount++;
                return;
            }
        }
    }

    public void printStars(int grade, int amount) {
        System.out.print(grade + ": ");
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "";
    }

    public void printStatistics() {
        System.out.println("Point average (all): " + this.pointsTotal / this.pointsTotalCount);
        if (this.pointsPassedCount == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.pointsPassed / this.pointsPassedCount);
        }
        System.out.println("Pass percentage: " + 100 * this.pointsPassedCount * 1.0 / pointsTotalCount);
        System.out.println("Grade distribution:");
        printStars(5, this.gradeFiveCount);
        printStars(4, this.gradeFourCount);
        printStars(3, this.gradeThreeCount);
        printStars(2, this.gradeTwoCount);
        printStars(1, this.gradeOneCount);
        printStars(0, this.gradeZeroCount);
    }

}


public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate day = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + day);

        SimpleDate newDate = day.afterNumberOfDays(7);
        for (int week = 1; week < 7; week++) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("Old date: " + day);
    }
}

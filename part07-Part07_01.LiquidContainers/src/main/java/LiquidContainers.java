
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            if (input.contains("add")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount > 0 && (amount + first < 100)) {
                    first += amount;
                } else if (amount + first >= 100) {
                    first = 100;
                }

            }

            if (input.contains("remove")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount >= second) {
                    second = 0;
                    continue;
                }
                if (amount < second) {
                    second -= amount;
                    continue;
                }

            } if (input.contains("move")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount > first && (amount + second <= 100)) {
                    int toBeMoved = first - amount;
                    first = 0;
                    second += amount - first + toBeMoved;

                }
                if (amount <= first) {
                    first -= amount;
                    if (amount + second < 100) {
                        second += amount;
                    } else {
                        second = 100;
                    }

                }
            }
        }
    }

}

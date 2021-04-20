

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.getCurrentCapacity());
            System.out.println("Second: " + second.getCurrentCapacity());
            System.out.print("> ");

            String input = scan.nextLine();
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            if (input.equals("quit")) {
                break;
            }

            if (input.contains("add")) {
                int amount = Integer.valueOf(partsOfInput[1]);
                first.add(amount);
            }

            if (input.equals("move")) {
                int amount = Integer.valueOf(partsOfInput[1]);
                if (amount >= first.getCapacity() && (amount + second.getCapacity() <= 100)) {
                    int toBeMoved = first.getCapacity() - amount;
                    first.remove(100);
                    second.add(amount - first.getCapacity() + toBeMoved);
                }
                if (amount < first.getCapacity()) {
                    first.remove(amount);
                    if (amount + second.getCapacity() < 100) {
                        second.add(amount);
                    } else {
                        second.add(100);
                    }

                }
            }

            if (input.equals("remove")) {
                int amount = Integer.valueOf(partsOfInput[1]);
                second.remove(amount);
            }

            if (input.equals("contains")) {
                System.out.println(first.contains());
            }

        }

    }
}


 
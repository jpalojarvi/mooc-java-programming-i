
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private TodoList toDoList;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.toDoList.add(toAdd);
                continue;
            }

            if (command.equals("list")) {
                this.toDoList.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(number);
                continue;
            }
            System.out.println("Unknown command");

        }
    }
}

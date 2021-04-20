
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SandboxMain {

    public static void main(String[] args) {
//        // Write your program here
//        SandboxPerson matti = new SandboxPerson("Matti");
//        matti.setWeight(86);
//        matti.setHeight(180);
//
//        SandboxPerson juhana = new SandboxPerson("Juhana");
//        juhana.setWeight(34);
//        juhana.setHeight(132);
//
//        SandboxPerson awak = new SandboxPerson("Awak");
//        awak.setHeight(194);
//        awak.setWeight(73);
//
//        SandboxAmusementParkRide hurjakuru = new SandboxAmusementParkRide("Hurjakuru", 140);
//        System.out.println(hurjakuru);
//
//        System.out.println();
//
//        hurjakuru.allowedToRide(matti);
//        hurjakuru.allowedToRide(juhana);
//        hurjakuru.allowedToRide(awak);
//
//        System.out.println(hurjakuru);
//        System.out.println(hurjakuru.averageHeightOfPeopleOnRide());
//
//        System.out.println(hurjakuru.getTallest().getName());
//        SandboxPerson tallest = hurjakuru.getTallest();
//        System.out.println(tallest.getName());
//
//        hurjakuru.removeEveryoneOnRide();
//        System.out.println(hurjakuru);

        Scanner scanner = new Scanner(System.in);
        SandBoxWordSet set = new SandBoxWordSet();
        
        SandboxUserInterface userInterface = new SandboxUserInterface(set, scanner);
        userInterface.start();

    }
}

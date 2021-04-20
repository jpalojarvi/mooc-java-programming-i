
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] intArray = {3, 1, 5, 99, 3, 12};
        sort(intArray);
        
        String[] stringArray = {"ffs", "asd", "lol"};
        sort(stringArray);
        
        
    }

    public static void sort(int[] array) {
        System.out.println("Before sorting:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting:" + Arrays.toString(array));
    }

    public static void sort(String[] array) {
        System.out.println("Before sorting:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting:" + Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        System.out.println("Before sorting: " + integers);
        Collections.sort(integers);
        System.out.println("After sorting:" + integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        System.out.println("Before sorting: " + strings);
        Collections.sort(strings);
        System.out.println("After sorting:" + strings);
    }
}


import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {-1, 6, 9, 8, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//        int[] numbers = {6, 7, 8, 6};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int reference = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < reference) {
                reference = array[i];
            }
        }
        return reference;
    }

    public static int indexOfSmallest(int[] array) {
        int referenceValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < referenceValue) {
                referenceValue = array[i];
                index = i;
            }

        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int referenceValue = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < referenceValue) {
                referenceValue = array[i];
                index = i;
            }
        }
        return index;
    }

    //         int[] numbers = {6, 7, 8, 6};   1            0
    public static void swap(int[] array, int index1, int index2) {
        int placeHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeHolder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
            System.out.println("");
        }
    }
}

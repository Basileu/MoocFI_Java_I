
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 55, 48, 29, 6, 3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println("Sorting...");
        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

}

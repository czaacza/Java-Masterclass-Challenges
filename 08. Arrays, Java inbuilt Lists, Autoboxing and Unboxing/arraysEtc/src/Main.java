import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntigers = getIntigers(5);

        printArray(myIntigers);

//        System.out.println("Average of myIntigers = " + getAverage(myIntigers));

        printArray(sortIntegers(myIntigers));
    }


    public static int[] getIntigers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] oldArray) {
        int[] sortedArray = Arrays.copyOf(oldArray, oldArray.length);
        int i, j;
        for (i = 1; i < sortedArray.length; i++) {
            int key = sortedArray[i];
            j = i - 1;
            while (j >= 0 && sortedArray[j] < key) {
                sortedArray[j + 1] = sortedArray[j];
                j--;
            }
            sortedArray[j + 1] = key;
        }
        return sortedArray;
    }
}

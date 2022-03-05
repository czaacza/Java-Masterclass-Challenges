import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number of items you want to pass: ");
        int count = scanner.nextInt();
        int[] array = readIntigers(count);
        System.out.println("An integer array: " + Arrays.toString(array));
        System.out.println("Minimal value: " + findMin(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static int[] readIntigers(int count) {
        int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a value: ");
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
    }

}


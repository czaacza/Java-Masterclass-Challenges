package mycompany;

public class SumDigits {
    public static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}

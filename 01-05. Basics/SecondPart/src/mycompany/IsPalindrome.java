package mycompany;

public class IsPalindrome {
    public static boolean isPalindrome(int number) {
        if (number > -10 && number < 10) {
            return true;
        }
        int ogNumber = number;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return ogNumber == reverseNumber;
    }
}

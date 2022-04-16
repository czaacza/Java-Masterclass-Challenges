package mycompany;

public class SumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        if(number < 10)
            return number;

        int lastDigit = number % 10;
        int firstDigit = lastDigit;
        while(number != 0){
           firstDigit = number;
           number /= 10;
        }

        return firstDigit + lastDigit;
    }
}

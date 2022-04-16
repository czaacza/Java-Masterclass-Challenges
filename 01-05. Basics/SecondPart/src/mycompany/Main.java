package mycompany;

public class Main {
    public static void main(String[] args) {

//      zadanie 1 - suma cyfr
        int liczba = 1234;
        System.out.println("Suma cyfr: " + SumDigits.sumDigits(liczba));

//      zadanie 2 - palindrom
        int liczba2 = 1;
        if (IsPalindrome.isPalindrome(liczba2)) {
            System.out.println("Liczba " + liczba2 + " jest palindromem.");
        } else {
            System.out.println("Liczba " + liczba2 + " NIE jest palindromem.");
        }
//      zadanie 3 - suma pierwszej i ostatniej cyfry
        int liczba3 = -1001;
        System.out.println("Suma pierwszej i ostatniej cyfry liczby " + liczba3 + ": " + SumFirstAndLastDigit.sumFirstAndLastDigit(liczba3));

//      zadanie 4 - suma parzystych cyfr liczby
        int liczba4 = 252;
        System.out.println("Suma parzystych cyfr liczby " + liczba4 + ": " + GetEvenDigitSum.getEvenDigitSum(liczba4));

//      zadanie 5 - Najwiekszy wspolny dzielnik
        int liczba5a = 81;
        int liczba5b = 153;
        System.out.println("NWD liczb " + liczba5a + " i " + liczba5b + " = " + GreatestCommonDivisor.getGreatestCommonDivisor(liczba5a,liczba5b));
    }

}

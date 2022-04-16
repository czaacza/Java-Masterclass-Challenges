import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter surname: ");
            String surname = scanner.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + (2022 - yearOfBirth) + " years old.");
        } else {
            System.out.println("Error! You did not put int");
        }
        scanner.close();
    }
}

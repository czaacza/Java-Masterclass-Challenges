import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static ArrayList<Contact> contacts = new ArrayList<Contact>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isEnded = false;

    public void printInstructions() {
        System.out.println("0. Turn off the phone");
        System.out.println("1. Print contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove contact");
        System.out.println("5. Find contact");
    }

    public void usePhone() {
        printInstructions();
        while (!isEnded) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();


            switch (number) {
                case 0:
                    phoneQuit();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                default:
                    System.out.println("Wrong number entered.");
                    printInstructions();
                    break;
            }
        }
    }

    private void findContact() {
        System.out.println("Print the name of the contact to find.");
        String name = scanner.nextLine();
        System.out.println("Print the number of the contact to find.");
        int number = scanner.nextInt();
        scanner.nextLine();
        Contact contact = new Contact(name, number);

        if (contacts.indexOf(contact) >= 0) {
            System.out.println(contact.getName() + " found on " + contacts.indexOf(contact) + " position");
        } else {
            System.out.println(contact.getName() + " not found in the list.");
        }

    }

    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private void removeContact() {
        System.out.println("Print the name of the contact to remove.");
        String name = scanner.nextLine();

        if (findContact(name) >= 0) {
            System.out.println("Removing " + name + " from the list of contacts.");
        } else {
            System.out.println("This number does not exist.");
        }

    }

    private void updateContact() {
        System.out.println("Print the name of the contact to update.");
        String name = scanner.nextLine();

        if (findContact(name) >= 0) {
            System.out.println("Select name of the new contact: ");
            String newName = scanner.nextLine();
            System.out.println("Select number of the new contact: ");
            int newNumber = scanner.nextInt();
            scanner.nextLine();

            Contact newContact = new Contact(newName, newNumber);
            System.out.println("Adding " + newContact.getName() + " to the list of contacts.");
            contacts.set(findContact(name), newContact);
        } else {
            System.out.println("There is no contact with this name and number to select.");
            System.out.println("You can add a new contact instead.");
        }

    }

    private void addContact() {
        System.out.println("Enter name of the contact to add: ");
        String name = scanner.nextLine();
        System.out.println("Enter number of the cantact to add: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        Contact contact = new Contact(name, number);

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists in the number of " + findContact(contact.getName())+1);
        } else {
            System.out.println(findContact(contact));
            System.out.println("Adding " + name + " to list of contacts.");
            contacts.add(contact);
        }
    }

    private void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + ". Name: " + contacts.get(i).getName() + " Phone number: " +
                    contacts.get(i).getPhoneNumber());
        }
    }

    private void phoneQuit() {
        System.out.println("Turning off the phone.");
        isEnded = true;
    }


}

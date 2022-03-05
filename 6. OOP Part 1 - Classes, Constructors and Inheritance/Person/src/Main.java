public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Mati");
        person.setLastName("");
        person.setAge(19);
        System.out.println("Person full name: " + person.getFullName());
        System.out.println("Is teen?: " + person.isTeen());


    }
}

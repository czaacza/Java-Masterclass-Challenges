public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        if (this.firstName.isEmpty()) {
            if (this.lastName.isEmpty())
                return "";
            return this.lastName;
        }
        if (this.lastName.isEmpty())
            return this.firstName;
        return this.firstName + " " + this.lastName;
    }

}

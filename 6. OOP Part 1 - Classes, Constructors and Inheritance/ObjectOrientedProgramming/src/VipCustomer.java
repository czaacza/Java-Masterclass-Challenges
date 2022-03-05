public class VipCustomer {
    private String  name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name",2.50, "default email");
    }
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"default email");
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(double creditLimit, String email) {
        this("Default name", creditLimit, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

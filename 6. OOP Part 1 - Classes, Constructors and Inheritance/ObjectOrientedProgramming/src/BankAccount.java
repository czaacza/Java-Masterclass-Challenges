public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56789",2.50, "Default name","Default adress","default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAdress,
                       String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailAdress = customerEmailAdress;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Not enough balance to withdraw money");
        }
        this.balance -= withdrawalAmount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

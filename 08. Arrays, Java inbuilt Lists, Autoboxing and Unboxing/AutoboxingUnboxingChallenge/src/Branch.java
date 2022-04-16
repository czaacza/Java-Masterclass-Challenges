import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(Customer customer) {
        if (findCustomer(customer.getName()) < 0) {
            System.out.println("Adding customer to branch " + this.name);
            customers.add(customer);
            return true;
        } else {
            System.out.println("Customer " + customer.getName() + " already on a branch " + this.name);
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        if (findCustomer(customerName) >= 0) {
            customers.get(findCustomer(customerName)).addTransaction(amount);
            return true;
        } else {
            System.out.println("Customer " + customerName + " not available on a branch " + this.name);
            return false;
        }
    }

    private int findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

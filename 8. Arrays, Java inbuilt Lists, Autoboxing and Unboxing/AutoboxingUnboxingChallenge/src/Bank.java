import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) < 0) {
            branches.add(new Branch(branchName));
            return true;
        } else {
            System.out.println("Branch already exists.");
            return false;
        }
    }

    public boolean addCustomerToBranch(String customerName, Branch branch, double initialAmount) {
        boolean isAdded = branch.addNewCustomer(new Customer(customerName));
        boolean isTransactionDone = branch.addCustomerTransaction(customerName,  initialAmount);

        return (isAdded && isTransactionDone);
    }

    public boolean addTransactionToCustomer(Customer customer, double amount) {
        customer.addTransaction(amount);
        return true;
    }

    public void showBranchCustomers(Branch branch) {
        System.out.println("Customers on branch " + branch.getName());
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            System.out.println(i + ". " + branch.getCustomers().get(i).getName());
            System.out.println("Transactions: ");
            for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                System.out.println(j + ". " + branch.getCustomers().get(i).getTransactions().get(j));
            }
        }
    }


    private int findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName))
                return i;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}

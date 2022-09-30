package listsBanking;

import java.util.ArrayList;

public class Bank {

  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    branches = new ArrayList<>();
  }

  public boolean addBranch(String branchName) {
    try {
      branches.add(new Branch(branchName));
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
    try {
      Branch branch = findBranch(branchName);
      branch.newCustomer(customerName, initialTransaction);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
    try {
      Branch branch = findBranch(branchName);
      Customer customer = branch.findCustomer(customerName);
      customer.addTransaction(transaction);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  private Branch findBranch(String branchName) {
    return branches.stream().filter(branch -> branchName.equals(branch.getName())).findFirst().orElse(null);
  }

  public boolean listCustomers(String branchName, boolean printTransactions) {
    try{
      Branch branch = findBranch(branchName);
      ArrayList<Customer> customers = branch.getCustomers();

      if (printTransactions) {
        customers.forEach(customer -> System.out.println(customer.getName() + ", " + customer.getTransactions()));
      } else {
        customers.forEach(customer -> System.out.println(customer.getName()));
      }

      return true;
    } catch (Exception exception) {
      return false;
    }
  }
}

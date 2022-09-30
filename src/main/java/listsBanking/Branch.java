package listsBanking;

import java.util.ArrayList;

public class Branch {

  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    customers = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  public boolean newCustomer(String name, double initialTransaction) {
    try {
      customers.add(new Customer(name, initialTransaction));
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public boolean addCustomerTransaction(String customerName, double transaction) {
    try {
      Customer customer = findCustomer(customerName);
      customer.addTransaction(transaction);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  public Customer findCustomer(String name) {
    return customers.stream().filter(customer -> name.equals(customer.getName())).findFirst().orElse(null);
  }
}

package bankmanagement;

import bankmanagement.Model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer u = new Customer("Deep", "34", "deep@gmail", "abcd");
        System.out.println(u.getName());
    }
}
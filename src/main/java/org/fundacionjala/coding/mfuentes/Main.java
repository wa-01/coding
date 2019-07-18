package org.fundacionjala.coding.mfuentes;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Magali");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 1), 4));
        System.out.println(customer.statement());
    }
}

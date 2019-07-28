package org.fundacionjala;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        customer.addRental(new Rental(new Movie("jumanji", 2), 2));
        System.out.println(customer.statement());
    }
}

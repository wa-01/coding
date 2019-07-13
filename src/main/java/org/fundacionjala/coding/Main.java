package org.fundacionjala.coding;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", new NewRelease()), 2));
        customer.addRental(new Rental(new Movie("Terminator", new Regular()), 2));
        customer.addRental(new Rental(new Movie("El Rey Leon", new Children()), 3));
        System.out.println(customer.getStatement());
    }
}

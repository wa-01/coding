package org.fundacionjala.coding.jose.colina;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new newReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new regularMovie("Terminator"), 2));
        customer.statement();
    }

}

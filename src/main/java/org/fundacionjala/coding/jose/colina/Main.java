package org.fundacionjala.coding.jose.colina;

public final class Main {
    private Main() {
        throw new IllegalStateException("Utility class");
    }
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.statement();
    }

}

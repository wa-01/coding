package org.fundacionjala.coding.mmendieta;

public final class Main {

    private Main() {
        // not called
    }

    static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new MovieNewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new MovieRegular("Terminator"), 2));
        System.out.println(customer.statement());
    }
}

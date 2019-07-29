package org.fundacionjala.coding.rmendoza;

class Main {

    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 3), 1));
        //customer.addRental(new Rental(new Movie("Terminator", 1), 3));
        System.out.println(customer.getStatement());
    }
}

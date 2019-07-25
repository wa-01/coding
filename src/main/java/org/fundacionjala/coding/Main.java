package org.fundacionjala.coding;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        AMovie children1 = new ChildrensMovie("El Rey Leon");
        AMovie newRelease1 =  new NewReleaseMovie("The Revenant");
        AMovie regular1 = new RegularMovie("Terminator");
        customer.addRental(new Rental(newRelease1, 2));
        customer.addRental(new Rental(regular1, 2));
        customer.addRental(new Rental(children1, 3));
        System.out.println(customer.getStatement());
    }
}

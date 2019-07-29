package org.fundacionjala.coding.acamacho;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomer(){
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", Category.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Terminator", Category.REGULAR), 2));

        assertEquals("Rental Record for Test\n"+
                "\tThe Revenant\t6.0\n"+
                "\tTerminator\t2.0\n"+
                "Amount owed is 8.0\n"+
                "You earned 3 frequent renter points", customer.statement());
    }
}

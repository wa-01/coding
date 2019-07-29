package org.fundacionjala.coding.mfuentes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RentMovieTest {
    @Test
    public void MovieRentalGetCustomerNameTest () {
        Customer c = new Customer("Magali");
        assertEquals("Magali", c.getName());
    }

    @Test
    public void MovieRentalRegularPrice () {
        Customer customer = new Customer("Magali");
        customer.addRental(new Rental(new Movie("The Revenant", new RegularPrice()), 3));
        String expected = "Rental Record for Magali\n" +
                "\tThe Revenant\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void MovieRentalNewReleasePrice () {
        Customer customer = new Customer("Magali");
        customer.addRental(new Rental(new Movie("Star Wars", new NewReleasePrice()), 3));
        String expected = "Rental Record for Magali\n" +
                "\tStar Wars\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void MovieRentalChildrenPrice () {
        Customer customer = new Customer("Magali");
        customer.addRental(new Rental(new Movie("Madagascar", new ChildrenPrice()), 3));
        String expected = "Rental Record for Magali\n" +
                "\tMadagascar\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }
}
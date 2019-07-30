package org.fundacionjala.coding.mfuentes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentMovieTest {
    
    @Test
    public void movieRentalGetCustomerNameTest() {
        Customer c = new Customer("Angy");
        assertEquals("Angy", c.getName());
    }

    @Test
    public void movieRentalRegularPrice() {
        Customer customer = new Customer("Maria");
        customer.addRental(new Rental(new Movie("The King", new RegularPrice()), 3));
        String expected = "Rental Record for Maria\n" +
                "\tThe King\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void movieRentalNewReleasePrice() {
        Customer customer = new Customer("Laura");
        customer.addRental(new Rental(new Movie("Star Wars", new NewReleasePrice()), 3));
        String expected = "Rental Record for Laura\n" +
                "\tStar Wars\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void movieRentalChildrenPrice() {
        Customer customer = new Customer("Sofia");
        customer.addRental(new Rental(new Movie("Madagascar", new ChildrenPrice()), 3));
        String expected = "Rental Record for Sofia\n" +
                "\tMadagascar\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }
}
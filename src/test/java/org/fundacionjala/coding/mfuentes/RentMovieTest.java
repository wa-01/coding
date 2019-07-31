package org.fundacionjala.coding.mfuentes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentMovieTest {
    private static final int DAYS_RENTED_REGULAR = 4;
    private static final int DAYS_RENTED_RELEASE = 2;
    private static final int DAYS_RENTED_CHILDREN = 5;

    @Test
    public void movieRentalGetCustomerNameTest() {
        Customer c = new Customer("Angy");
        assertEquals("Angy", c.getName());
    }

    @Test
    public void movieRentalRegularPrice() {
        Customer customer = new Customer("Maria");
        customer.addRental(new Rental(new Movie("The King", new RegularPrice()), DAYS_RENTED_REGULAR));
        String expected = "Rental Record for Maria\n"
                + "\tThe King\t5.0\n"
                + "Amount owed is 5.0\n"
                + "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void movieRentalNewReleasePrice() {
        Customer customer = new Customer("Laura");
        customer.addRental(new Rental(new Movie("Star Wars", new NewReleasePrice()), DAYS_RENTED_RELEASE));
        String expected = "Rental Record for Laura\n"
                + "\tStar Wars\t6.0\n"
                + "Amount owed is 6.0\n"
                + "You earned 2 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void movieRentalChildrenPrice() {
        Customer customer = new Customer("Sofia");
        customer.addRental(new Rental(new Movie("Madagascar", new ChildrenPrice()), DAYS_RENTED_CHILDREN));
        String expected = "Rental Record for Sofia\n"
                + "\tMadagascar\t4.5\n"
                + "Amount owed is 4.5\n"
                + "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }
}

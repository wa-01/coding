package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RentalTest {
    private Customer customer;
    private static final Logger LOGGER = Logger.getLogger("com.wa01.movies.rpfh.RentalTest");
    private static final int DAYS_RENTED_REGULAR = 4;
    private static final int DAYS_RENTED_RELEASE = 2;
    private static final int DAYS_RENTED_CHILDREN = 5;

    @Before
    public void setUp() {
        customer = new Customer("Tester");
        customer.addRental(new Rental(new Release("The Revenant"), DAYS_RENTED_RELEASE));
        customer.addRental(new Rental(new Regular("Terminator"), DAYS_RENTED_REGULAR));
        customer.addRental(new Rental(new Children("Toy Story 2"), DAYS_RENTED_CHILDREN));
        customer.addRental(new Rental(new Release("Infinity War"), DAYS_RENTED_RELEASE));
    }

    @Test
    public void confirmCustomer() {
        String result = "Rental Record for " + customer.getName() + "\n";
        CharSequence name = "Tester";
        Assert.assertTrue(result.contains(name));
    }

    @Test
    public void confirmRent() {
        int result = customer.getPoints();
        Assert.assertTrue(result > 0);
    }

    @Test
    public void customerCanRentMovies() {
        Assert.assertFalse(customer.getRentals().isEmpty());
        LOGGER.log(Level.INFO, () -> "Rental Record for " + customer.getName());
        Assert.assertTrue(customer.getBill() > 0);
    }

}

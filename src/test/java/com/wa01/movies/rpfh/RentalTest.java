package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RentalTest {
    private Customer customer;
    private static final Logger LOGGER = Logger.getLogger("com.wa01.movies.rpfh.RentalTest");


    @Before
    public void setUp() {
        customer = new Customer("Tester");
        customer.addRental(new Rental(new Release("The Revenant"), 1));
        customer.addRental(new Rental(new Regular("Terminator"), 1));
        customer.addRental(new Rental(new Children("Toy Story 2"), 4));
        customer.addRental(new Rental(new Release("Infinity War"), 1));
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

package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RentalTest {
    private Customer customer;
    private Release release;
    private Regular regular;
    private Children children;

    @Before
    public void setUp() {
        customer = new Customer("Tester");
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
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
    public void confirm() {
        int result = customer.getPoints();
        Assert.assertTrue(result > 0);
    }

    @Test
    public void customerCanRentMovies() {
        release = new Release("Jumanji II");
        regular = new Regular("Assassins Creed");
        children = new Children("Toy Story");

        customer.addRental(new Rental(release, 2));
        customer.addRental(new Rental(regular, 2));
        customer.addRental(new Rental(children, 2));

        Assert.assertFalse(customer.getRentals().isEmpty());
    }

}

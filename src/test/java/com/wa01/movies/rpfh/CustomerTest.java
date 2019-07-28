package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    private Customer customer;
    private Release release;
    private Regular regular;
    private Children children;

    @Before
    public void setUp(){
        release = new Release("Captain Marvel");
        regular = new Regular("New Regular Movie");
        children = new Children("New Children Movie");
    }

    @Test
    public void customerHasName() {
        String customerName = "Petisa";
        customer = new Customer(customerName);
        Assert.assertEquals(customerName, customer.getName());
    }

    @Test
    public void customerHasPointsForRentReleaseMovie() {
        customer = new Customer("Maria");
        customer.addRental(new Rental(release, 1));
        Assert.assertTrue(customer.getPoints() >= 1);
    }

    @Test
    public void customerHasNotPointsForRentRegularMovie() {
        customer = new Customer("Martha");
        customer.addRental(new Rental(regular, 1));
        Assert.assertTrue(customer.getPoints() == 0);
    }

    @Test
    public void customerHasNotPointsForRentChildrenMovie() {
        customer = new Customer("Andy");
        customer.addRental(new Rental(children, 1));
        Assert.assertTrue(customer.getPoints() == 0);
    }
}

package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    private Customer customer;
    private Release release;
    private Regular regular;
    private Children children;

    @Test
    public void customerHasName() {
        String customer_name = "Petisa";
        customer = new Customer(customer_name);
        Assert.assertEquals(customer_name, customer.getName());
    }

    @Test
    public void customerHasPointsForRentReleaseMovie() {
        customer = new Customer("Maria");
        release = new Release("Captain Marvel");
        customer.addRental(new Rental(release, 1));
        Assert.assertTrue(customer.getPoints() >= 1);
    }

    @Test
    public void customerHasNotPointsForRentRegularMovie() {
        customer = new Customer("Maria");
        regular = new Regular("New Regular Movie");
        customer.addRental(new Rental(regular, 1));
        Assert.assertTrue(customer.getPoints() == 0);
    }

    @Test
    public void customerHasNotPointsForRentChildrenMovie() {
        customer = new Customer("Maria");
        children = new Children("New Children Movie");
        customer.addRental(new Rental(children, 1));
        Assert.assertTrue(customer.getPoints() == 0);
    }
}

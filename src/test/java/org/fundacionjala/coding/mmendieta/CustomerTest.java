package org.fundacionjala.coding.mmendieta;

import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {

    static final int ZERO_DAYS_RENTED = 0;
    static final int ONE_DAYS_RENTED = 1;
    static final int TWO_DAYS_RENTED = 2;
    static final int THREE_DAYS_RENTED = 3;
    static final int FOUR_DAYS_RENTED = 4;
    static final int DELTA = 0;
    static final double EXPECTED_AMOUNT_1_5 = 1.5;
    static final double EXPECTED_AMOUNT_3_5 = 3.5;
    static final double EXPECTED_AMOUNT_3_0 = 3.0;




    @Test
    public void testShowCustomerStatement() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new MovieNewRelease("The Revenant"), TWO_DAYS_RENTED));
        customer.addRental(new Rental(new MovieRegular("Terminator"), TWO_DAYS_RENTED));
        Assert.assertEquals("Test", customer.getName());
    }

    @Test
    public void testShowCustomerMovieChildrenTotalAmount() {
        Customer customer = new Customer("TestChildren");
        customer.addRental(new Rental(new MovieChildrens("Pokemon"), TWO_DAYS_RENTED));
        Assert.assertEquals(EXPECTED_AMOUNT_1_5, customer.getTotalAmount(), DELTA);
    }

    @Test
    public void testShowCustomerMovieDaysFrequentRetenerLessThanOne() {
        Customer customer = new Customer("TestChildrenDaysFrequentRetenerLessThanOne");
        customer.addRental(new Rental(new MovieNewRelease("Avengers V"), ZERO_DAYS_RENTED));
        Assert.assertEquals(1, customer.getFrequentRenterPoints());
    }

    @Test
    public void testMovieRegularGetAmountOwed() {
        Customer customer = new Customer("testMovieRegularGetAmountOwed");
        customer.addRental(new Rental(new MovieRegular("La Llorona"), THREE_DAYS_RENTED));
        Assert.assertEquals(EXPECTED_AMOUNT_3_5, customer.getTotalAmount(), DELTA);
    }

    @Test
    public void testMovieChildrensGetAmountOwed() {
        Customer customer = new Customer("testMovieChildrensGetAmountOwed");
        customer.addRental(new Rental(new MovieChildrens("Godzilla"), FOUR_DAYS_RENTED));
        Assert.assertEquals(EXPECTED_AMOUNT_3_0, customer.getTotalAmount(), DELTA);
    }
}

package org.fundacionjala.coding.rmendoza;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void TestChildrenMovieFourDayRental(){
        double expectedTotal = 3.0;
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("Lion King", 2), 4));
        assertEquals(expectedTotal, customer.getTotalStatement(), 0);
    }

    @Test
    public void TestRegularMovieFiveDayRental(){
        double expectedTotal = 6.5;
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 0), 5));
        assertEquals(expectedTotal, customer.getTotalStatement(), 0);
    }

    @Test
    public void TestNewReleaseMovieThreeDayRental(){
        double expectedTotal = 9.0;
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("Joker", 1), 3));
        assertEquals(expectedTotal, customer.getTotalStatement(), 0);
    }

    @Test
    public void TestRentOneOfEachMovieForFiveDays(){
        double expectedTotal = 26.0;
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 0), 5));
        customer.addRental(new Rental(new Movie("Joker", 1), 5));
        customer.addRental(new Rental(new Movie("Lion King", 2), 5));
        assertEquals(expectedTotal, customer.getTotalStatement(), 0);
    }

    @Test
    public void TestThreeDayRentalRegularHasExtraChargeButChildrenNot(){
        double expectedTotal = 5.0;
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 0), 3));
        customer.addRental(new Rental(new Movie("Lion King", 2), 3));
        assertEquals(expectedTotal, customer.getTotalStatement(), 0);
    }

}
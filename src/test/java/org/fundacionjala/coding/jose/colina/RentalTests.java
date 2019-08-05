package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.Test;

public class RentalTests {
    private static final int EXPECTED_DAYS_RENTED = 3;
    private Rental rental;
    private Movie expectedMovie;
    private Movie actualMovie;

    @Test
    public void testGetDaysRented() {
        rental = new Rental(new RegularMovie("regular"), EXPECTED_DAYS_RENTED);
        int actualRentedDays = rental.getDaysRented();
        Assert.assertEquals(EXPECTED_DAYS_RENTED, actualRentedDays);
    }

    @Test
    public void testGetMovieWithNewReleaseMovie() {
        expectedMovie = new NewReleaseMovie("new release movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void testGetMovieWithRegularMovie() {
        expectedMovie = new RegularMovie("regular movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void testGetMovieWithChildrenMovie() {
        expectedMovie = new ChildrenMovie("children movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }
}

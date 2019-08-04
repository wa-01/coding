package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.Test;

public class RentalTests {
    private Rental rental;
    private Movie expectedMovie;
    private Movie actualMovie;

    @Test
    public void testGetDaysRented(){
        int expectedDaysRented = 3;
        rental = new Rental(new RegularMovie("regular"), expectedDaysRented);
        int actualRentedDays = rental.getDaysRented();
        Assert.assertEquals(expectedDaysRented, actualRentedDays);
    }

    @Test
    public void testGetMovieWithNewReleaseMovie(){
        expectedMovie = new NewReleaseMovie("new release movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void testGetMovieWithRegularMovie(){
        expectedMovie = new RegularMovie("regular movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }

    @Test
    public void testGetMovieWithChildrenMovie(){
        expectedMovie = new ChildrenMovie("children movie");
        rental = new Rental(expectedMovie, 1);
        actualMovie = rental.getMovie();
        Assert.assertEquals(expectedMovie, actualMovie);
    }
}

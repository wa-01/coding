package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularAbsMovieTest {
    private RegularAbsMovie regularMovie;

    @Before
    public void setUp() {
        regularMovie = new RegularAbsMovie("Finding Nemo");
    }

    @Test
    public void calculatePriceOfRentalIfRentedForLessThanTwoDays() {
        assertEquals(2, regularMovie.getPrice(1), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForExactlyTwoDays() {
        assertEquals(2, regularMovie.getPrice(2), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForMoreThanTwoDays() {
        assertEquals(3.5, regularMovie.getPrice(3), 0.0);
    }
}
package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularAbsMovieTest {
    private RegularAbsMovie regularMovie;
    private static final int DAYS_RENTED_REGULAR_A = 1;
    private static final int DAYS_RENTED_REGULAR_B = 2;
    private static final int DAYS_RENTED_REGULAR_C = 3;
    private static final int DAYS_RENTED_REGULAR_EXPECTED_A = 2;
    private static final int DAYS_RENTED_REGULAR_EXPECTED_B = 2;
    private static final double DAYS_RENTED_REGULAR_EXPECTED_C = 3.5;

    @Before
    public void setUp() {
        regularMovie = new RegularAbsMovie("Finding Nemo");
    }

    @Test
    public void calculatePriceOfRentalIfRentedForLessThanTwoDays() {
        assertEquals(DAYS_RENTED_REGULAR_EXPECTED_A, regularMovie.getPrice(DAYS_RENTED_REGULAR_A), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForExactlyTwoDays() {
        assertEquals(DAYS_RENTED_REGULAR_EXPECTED_B, regularMovie.getPrice(DAYS_RENTED_REGULAR_B), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForMoreThanTwoDays() {
        assertEquals(DAYS_RENTED_REGULAR_EXPECTED_C, regularMovie.getPrice(DAYS_RENTED_REGULAR_C), 0.0);
    }
}

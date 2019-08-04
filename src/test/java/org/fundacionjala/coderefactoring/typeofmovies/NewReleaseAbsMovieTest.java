package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseAbsMovieTest {
    private NewReleaseAbsMovie newReleaseMovie;
    private static final int DAYS_RENTED_NEW_RELEASE_A = 2;
    private static final int DAYS_RENTED_NEW_RELEASE_B = 3;
    private static final int DAYS_RENTED_NEW_RELEASE_C = 4;
    private static final int DAYS_RENTED_NEW_RELEASE_EXPECTED_A = 6;
    private static final int DAYS_RENTED_NEW_RELEASE_EXPECTED_B = 9;
    private static final int DAYS_RENTED_NEW_RELEASE_EXPECTED_C = 12;

    @Before
    public void setUp() {
        newReleaseMovie = new NewReleaseAbsMovie("Rapunsel");
    }

    @Test
    public void calculatePriceOfRentalBasedOnDaysRented() {
        assertEquals(DAYS_RENTED_NEW_RELEASE_EXPECTED_A, newReleaseMovie.getPrice(DAYS_RENTED_NEW_RELEASE_A), 0.0);
        assertEquals(DAYS_RENTED_NEW_RELEASE_EXPECTED_B, newReleaseMovie.getPrice(DAYS_RENTED_NEW_RELEASE_B), 0.0);
        assertEquals(DAYS_RENTED_NEW_RELEASE_EXPECTED_C, newReleaseMovie.getPrice(DAYS_RENTED_NEW_RELEASE_C), 0.0);
    }
}

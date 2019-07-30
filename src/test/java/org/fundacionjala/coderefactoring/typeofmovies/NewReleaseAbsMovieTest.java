package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseAbsMovieTest {
    private NewReleaseAbsMovie newReleaseMovie;

    @Before
    public void setUp() {
        newReleaseMovie = new NewReleaseAbsMovie("Rapunsel");
    }

    @Test
    public void calculatePriceOfRentalBasedOnDaysRented() {
        assertEquals(6, newReleaseMovie.getPrice(2), 0.0);
        assertEquals(9, newReleaseMovie.getPrice(3), 0.0);
        assertEquals(12, newReleaseMovie.getPrice(4), 0.0);
    }
}
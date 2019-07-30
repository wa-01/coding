package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrensAbsMovieTest {
    private ChildrensAbsMovie childrensMovie;

    @Before
    public void setUp() {
        childrensMovie = new ChildrensAbsMovie("Shreck 1");
    }

    @Test
    public void calculatePriceOfRentalIfRentedForLessThanThreeDays() {
        assertEquals(1.5, childrensMovie.getPrice(2), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForExactlyThreeDays() {
        assertEquals(1.5, childrensMovie.getPrice(3), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForMoreThanThreeDays() {
        assertEquals(3.0, childrensMovie.getPrice(4), 0.0);
    }
}

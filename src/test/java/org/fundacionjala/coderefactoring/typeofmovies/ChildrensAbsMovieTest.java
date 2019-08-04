package org.fundacionjala.coderefactoring.typeofmovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrensAbsMovieTest {
    private ChildrensAbsMovie childrensMovie;
    private static final int DAYS_RENTED_CHILDREN_A = 2;
    private static final int DAYS_RENTED_CHILDREN_B = 3;
    private static final int DAYS_RENTED_CHILDREN_C = 4;
    private static final double DAYS_RENTED_CHILDREN_EXPECTED_A = 1.5;
    private static final double DAYS_RENTED_CHILDREN_EXPECTED_B = 1.5;
    private static final double DAYS_RENTED_CHILDREN_EXPECTED_C = 3.0;

    @Before
    public void setUp() {
        childrensMovie = new ChildrensAbsMovie("Shreck 1");
    }

    @Test
    public void calculatePriceOfRentalIfRentedForLessThanThreeDays() {
        assertEquals(DAYS_RENTED_CHILDREN_EXPECTED_A, childrensMovie.getPrice(DAYS_RENTED_CHILDREN_A), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForExactlyThreeDays() {
        assertEquals(DAYS_RENTED_CHILDREN_EXPECTED_B, childrensMovie.getPrice(DAYS_RENTED_CHILDREN_B), 0.0);
    }

    @Test
    public void calculatePriceOfRentalIfRentedForMoreThanThreeDays() {
        assertEquals(DAYS_RENTED_CHILDREN_EXPECTED_C, childrensMovie.getPrice(DAYS_RENTED_CHILDREN_C), 0.0);
    }
}

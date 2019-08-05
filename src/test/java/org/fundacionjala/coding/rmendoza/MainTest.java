package org.fundacionjala.coding.rmendoza;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    static final double EXPECTED_TOTAL_CHILDREN_4_DAYS = 3.0;
    static final double EXPECTED_TOTAL_REGULAR_5_DAYS = 6.5;
    static final double EXPECTED_TOTAL_NEW_3_DAYS = 9.0;
    static final double EXPECTED_ONE_OF_EACH_5_DAYS = 26.0;
    static final double EXPECTED_REGULAR_CHILDREN_3_DAYS = 5.0;

    static final int EXPECTED_ONE_OF_EACH_5_DAYS_POINTS = 4;

    static final int RENT_THREE_DAYS = 3;
    static final int RENT_FOUR_DAYS = 4;
    static final int RENT_FIVE_DAYS = 5;
    static final int DELTA_VALUE = 0;

    static final String childrenMovie = "Lion King";
    static final String regularMovie = "The Revenant";
    static final String newReleaseMovie = "Joker";

    @Test
    public void testChildrenMovieFourDayRental() {
        Statement statement = new Statement("test");
        statement.addRental(new Rental(new MovieChildren(childrenMovie), RENT_FOUR_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_CHILDREN_4_DAYS, statement.getTotalStatement(), DELTA_VALUE);
    }

    @Test
    public void testRegularMovieFiveDayRental() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular(regularMovie), RENT_FIVE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_REGULAR_5_DAYS, statement.getTotalStatement(), DELTA_VALUE);
    }

    @Test
    public void testNewReleaseMovieThreeDayRental() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease(newReleaseMovie), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_NEW_3_DAYS, statement.getTotalStatement(), DELTA_VALUE);
    }

    @Test
    public void testRentOneOfEachMovieForFiveDays() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular(regularMovie), RENT_FIVE_DAYS));
        statement.addRental(new Rental(new MovieNewRelease(newReleaseMovie), RENT_FIVE_DAYS));
        statement.addRental(new Rental(new MovieChildren(childrenMovie), RENT_FIVE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_ONE_OF_EACH_5_DAYS, statement.getTotalStatement(), DELTA_VALUE);
    }

    @Test
    public void testThreeDayRentalRegularHasExtraChargeButChildrenNot() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular(regularMovie), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieChildren(childrenMovie), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_REGULAR_CHILDREN_3_DAYS, statement.getTotalStatement(), DELTA_VALUE);
    }

    @Test
    public void testGetCustomerFrequentRenterPoints() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular(regularMovie), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieNewRelease(newReleaseMovie), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieChildren(childrenMovie), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_ONE_OF_EACH_5_DAYS_POINTS, statement.getFrequentRenterPoints(), DELTA_VALUE);
    }

    @Test
    public void testThreeDayRentalRegularHasExtraChargeBu() {
        String expectedCustomerName = "Test";
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular(regularMovie), RENT_FOUR_DAYS));
        statement.addRental(new Rental(new MovieChildren(childrenMovie), RENT_FOUR_DAYS));
        statement.statement();
        assertEquals(expectedCustomerName, statement.getCustomerName());
    }
}

package org.fundacionjala.coding.rmendoza;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    final double EXPECTED_TOTAL_CHILDREN_4_DAYS = 3.0;
    final double EXPECTED_TOTAL_REGULAR_5_DAYS = 6.5;
    final double EXPECTED_TOTAL_NEW_3_DAYS = 9.0;
    final double EXPECTED_ONE_OF_EACH_5_DAYS = 26.0;
    final double EXPECTED_REGULAR_CHILDREN_3_DAYS = 5.0;

    final int EXPECTED_ONE_OF_EACH_5_DAYS_POINTS = 4;

    private final int RENT_THREE_DAYS = 3;
    private final int RENT_FOUR_DAYS = 4;
    private final int RENT_FIVE_DAYS = 5;
    final int DELTA = 0;

    @Test
    public void testChildrenMovieFourDayRental() {
        Statement statement = new Statement("test");
        statement.addRental(new Rental(new MovieChildren("Lion King"), RENT_FOUR_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_CHILDREN_4_DAYS, statement.getTotalStatement(), DELTA);
    }

    @Test
    public void testRegularMovieFiveDayRental() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), RENT_FIVE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_REGULAR_5_DAYS, statement.getTotalStatement(), DELTA);
    }

    @Test
    public void testNewReleaseMovieThreeDayRental() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease("Joker"), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_TOTAL_NEW_3_DAYS, statement.getTotalStatement(), DELTA);
    }

    @Test
    public void testRentOneOfEachMovieForFiveDays() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), RENT_FIVE_DAYS));
        statement.addRental(new Rental(new MovieNewRelease("Joker"), RENT_FIVE_DAYS));
        statement.addRental(new Rental(new MovieChildren("Lion King"), RENT_FIVE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_ONE_OF_EACH_5_DAYS, statement.getTotalStatement(), DELTA);
    }

    @Test
    public void testThreeDayRentalRegularHasExtraChargeButChildrenNot() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieChildren("Lion King"), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_REGULAR_CHILDREN_3_DAYS, statement.getTotalStatement(), DELTA);
    }

    @Test
    public void testGetCustomerFrequentRenterPoints() {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieNewRelease("Joker"), RENT_THREE_DAYS));
        statement.addRental(new Rental(new MovieChildren("Lion King"), RENT_THREE_DAYS));
        statement.statement();
        assertEquals(EXPECTED_ONE_OF_EACH_5_DAYS_POINTS, statement.getFrequentRenterPoints(), DELTA);
    }

    @Test
    public void testThreeDayRentalRegularHasExtraChargeBu() {
        String expectedCustomerName = "Test";
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), RENT_FOUR_DAYS));
        statement.addRental(new Rental(new MovieChildren("Lion King"), RENT_FOUR_DAYS));
        statement.statement();
        assertEquals(expectedCustomerName, statement.getCustomerName());
    }
}

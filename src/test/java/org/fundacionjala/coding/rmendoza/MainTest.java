package org.fundacionjala.coding.rmendoza;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void TestChildrenMovieFourDayRental() {
        double expectedTotal = 3.0;
        Statement statement = new Statement("test");
        statement.addRental(new Rental(new MovieChildren("Lion King"), 4));
        statement.statement();
        assertEquals(expectedTotal, statement.getTotalStatement(), 0);
    }

    @Test
    public void TestRegularMovieFiveDayRental() {
        double expectedTotal = 6.5;
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), 5));
        statement.statement();
        assertEquals(expectedTotal, statement.getTotalStatement(), 0);
    }

    @Test
    public void TestNewReleaseMovieThreeDayRental() {
        double expectedTotal = 9.0;
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease("Joker"), 3));
        statement.statement();
        assertEquals(expectedTotal, statement.getTotalStatement(), 0);
    }

    @Test
    public void TestRentOneOfEachMovieForFiveDays() {
        double expectedTotal = 26.0;
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), 5));
        statement.addRental(new Rental(new MovieNewRelease("Joker"), 5));
        statement.addRental(new Rental(new MovieChildren("Lion King"), 5));
        statement.statement();
        assertEquals(expectedTotal, statement.getTotalStatement(), 0);
    }

    @Test
    public void TestThreeDayRentalRegularHasExtraChargeButChildrenNot() {
        double expectedTotal = 5.0;
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), 3));
        statement.addRental(new Rental(new MovieChildren("Lion King"), 3));
        statement.statement();
        assertEquals(expectedTotal, statement.getTotalStatement(), 0);
    }

    @Test
    public void TestGetCustomerFrequentRenterPoints() {
        int expectedFrequentPoints = 4;
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), 3));
        statement.addRental(new Rental(new MovieNewRelease("Joker"), 3));
        statement.addRental(new Rental(new MovieChildren("Lion King"), 3));
        statement.statement();
        assertEquals(expectedFrequentPoints, statement.getFrequentRenterPoints(), 0);
    }

    @Test
    public void TestThreeDayRentalRegularHasExtraChargeBu() {
        String expectedCustomerName = "Test";
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieRegular("The Revenant"), 3));
        statement.addRental(new Rental(new MovieChildren("Lion King"), 3));
        statement.statement();
        assertEquals(expectedCustomerName, statement.getCustomerName());
    }
}
package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrequentPointsTests {
    private int rentedDays;
    private static NewReleaseMovie newReleaseMovie;
    private static RegularMovie regularMovie;
    private static ChildrenMovie childrenMovie;
    private double actualFrequentPoints;
    private double expectedFrequentPoints;

    @BeforeClass
    public static void setUpClass() {
        newReleaseMovie =  new NewReleaseMovie("new release");
        regularMovie =  new RegularMovie("regular");
        childrenMovie =  new ChildrenMovie("children");
    }

    @Test
    public void testGetFrequentPointsNewReleaseMovieWith1DaysRented() {
        rentedDays = 1;
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsNewReleaseMovieLessThan1DaysRented() {
        rentedDays = 0;
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsNewReleaseMovieGreaterThan1DaysRented() {
        rentedDays = 4;
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 2;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsRegularMovieWith0DaysRented() {
        rentedDays = 0;
        actualFrequentPoints = regularMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsRegularMovieWith5DaysRented() {
        rentedDays = 5;
        actualFrequentPoints = regularMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsChildrenMovieWith0DaysRented() {
        rentedDays = 0;
        actualFrequentPoints = childrenMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsChildrenMovieWith5DaysRented() {
        rentedDays = 5;
        actualFrequentPoints = childrenMovie.getFrequentRenterPoints(rentedDays);
        expectedFrequentPoints = 1;
        Assert.assertEquals(expectedFrequentPoints, actualFrequentPoints, 0);
    }
}

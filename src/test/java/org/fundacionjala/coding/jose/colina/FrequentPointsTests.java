package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrequentPointsTests {
    private static final int RENTED_DAYS_GREATER_THAN_ONE = 4;
    private static final int RENTED_DAYS_LESS_THAN_ONE = 0;
    private static final int RENTED_DAYS_GREATER_THAN_ZERO = 5;
    private static final int RENTED_DAYS_IS_ONE = 1;
    private static final int RENTED_DAYS_IS_ZERO = 0;
    private static final double EXPECTED_FREQUENT_NEW_RELEASE_LESS_ONE_RENTED_DAY = 1;
    private static final double EXPECTED_FREQUENT_NEW_RELEASE_GREATER_ONE_RENTED_DAY = 2;
    private static final double EXPECTED_FREQUENT_REGULAR = 1;
    private static final double EXPECTED_FREQUENT_CHILDREN = 1;
    private static NewReleaseMovie newReleaseMovie;
    private static RegularMovie regularMovie;
    private static ChildrenMovie childrenMovie;
    private double actualFrequentPoints;

    @BeforeClass
    public static void setUpClass() {
        newReleaseMovie =  new NewReleaseMovie("new release");
        regularMovie =  new RegularMovie("regular");
        childrenMovie =  new ChildrenMovie("children");
    }

    @Test
    public void testGetFrequentPointsNewReleaseMovieWith1DaysRented() {
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(RENTED_DAYS_IS_ONE);
        Assert.assertEquals(EXPECTED_FREQUENT_NEW_RELEASE_LESS_ONE_RENTED_DAY, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsNewReleaseMovieLessThan1DaysRented() {
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(RENTED_DAYS_LESS_THAN_ONE);
        Assert.assertEquals(EXPECTED_FREQUENT_NEW_RELEASE_LESS_ONE_RENTED_DAY, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsNewReleaseMovieGreaterThan1DaysRented() {
        actualFrequentPoints = newReleaseMovie.getFrequentRenterPoints(RENTED_DAYS_GREATER_THAN_ONE);
        Assert.assertEquals(EXPECTED_FREQUENT_NEW_RELEASE_GREATER_ONE_RENTED_DAY, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsRegularMovieWith0DaysRented() {
        actualFrequentPoints = regularMovie.getFrequentRenterPoints(RENTED_DAYS_IS_ZERO);
        Assert.assertEquals(EXPECTED_FREQUENT_REGULAR, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsRegularMovieGreaterThan0DaysRented() {
        actualFrequentPoints = regularMovie.getFrequentRenterPoints(RENTED_DAYS_GREATER_THAN_ZERO);
        Assert.assertEquals(EXPECTED_FREQUENT_REGULAR, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsChildrenMovieWith0DaysRented() {
        actualFrequentPoints = childrenMovie.getFrequentRenterPoints(RENTED_DAYS_IS_ZERO);
        Assert.assertEquals(EXPECTED_FREQUENT_CHILDREN, actualFrequentPoints, 0);
    }
    @Test
    public void testGetFrequentPointsChildrenMovieGreaterThan0DaysRented() {
        actualFrequentPoints = childrenMovie.getFrequentRenterPoints(RENTED_DAYS_GREATER_THAN_ZERO);
        Assert.assertEquals(EXPECTED_FREQUENT_CHILDREN, actualFrequentPoints, 0);
    }
}

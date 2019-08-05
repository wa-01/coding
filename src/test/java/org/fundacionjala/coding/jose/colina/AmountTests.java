package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmountTests {
    private static final int AMOUNT_FACTOR_NEW_RELEASE = 3;
    private static final double AMOUNT_FACTOR_REGULAR = 1.5;
    private static final double AMOUNT_FACTOR_CHILDREN = 1.5;
    private static final double EXPECTED_CHILDREN_LESS_OR_EQUAL_THREE_RENTED_DAYS = 1.5;
    private static final double EXPECTED_REGULAR_LESS_OR_EQUAL_TWO_RENTED_DAYS = 2;
    private static final int RENTED_DAYS_NEW_RELEASE = 2;
    private static final int RENTED_DAYS_LESS_THAN_TWO = 1;
    private static final int RENTED_DAYS_GREATER_THAN_TWO = 3;
    private static final int RENTED_DAYS_IS_TWO = 2;
    private static final int RENTED_DAYS_LESS_THAN_THREE = 2;
    private static final int RENTED_DAYS_GREATER_THAN_THREE = 5;
    private static final int RENTED_DAYS_IS_THREE = 3;
    private static NewReleaseMovie newReleaseMovie;
    private static RegularMovie regularMovie;
    private static ChildrenMovie childrenMovie;
    private double actualAmount;
    private double expectedAmount;

    @BeforeClass
    public static void setUpClass() {
        newReleaseMovie =  new NewReleaseMovie("new release");
        regularMovie =  new RegularMovie("regular");
        childrenMovie =  new ChildrenMovie("children");
    }

    @Test
    public void testGetAmountNewReleaseMovieWith2DaysRented() {
        actualAmount = newReleaseMovie.getAmount(RENTED_DAYS_NEW_RELEASE);
        expectedAmount = RENTED_DAYS_NEW_RELEASE * AMOUNT_FACTOR_NEW_RELEASE;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountRegularMovieLessThan2DaysRented() {
        actualAmount = regularMovie.getAmount(RENTED_DAYS_LESS_THAN_TWO);
        Assert.assertEquals(EXPECTED_REGULAR_LESS_OR_EQUAL_TWO_RENTED_DAYS, actualAmount, 0);
    }
    @Test
    public void testGetAmountRegularMovieWith2DaysRented() {
        actualAmount = regularMovie.getAmount(RENTED_DAYS_IS_TWO);
        Assert.assertEquals(EXPECTED_REGULAR_LESS_OR_EQUAL_TWO_RENTED_DAYS, actualAmount, 0);
    }

    @Test
    public void testGetAmountRegularMovieGreaterThan2DaysRented() {
        actualAmount = regularMovie.getAmount(RENTED_DAYS_GREATER_THAN_TWO);
        expectedAmount = EXPECTED_REGULAR_LESS_OR_EQUAL_TWO_RENTED_DAYS + (RENTED_DAYS_GREATER_THAN_TWO - RENTED_DAYS_IS_TWO) * AMOUNT_FACTOR_REGULAR;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountChildrenMovieLessThan3DaysRented() {
        actualAmount = childrenMovie.getAmount(RENTED_DAYS_LESS_THAN_THREE);
        Assert.assertEquals(EXPECTED_CHILDREN_LESS_OR_EQUAL_THREE_RENTED_DAYS, actualAmount, 0);
    }
    @Test
    public void testGetAmountChildrenMovieWith3DaysRented() {
        actualAmount = childrenMovie.getAmount(RENTED_DAYS_IS_THREE);
        Assert.assertEquals(EXPECTED_CHILDREN_LESS_OR_EQUAL_THREE_RENTED_DAYS, actualAmount, 0);
    }

    @Test
    public void testGetAmountChildrenMovieGreaterThan3DaysRented() {
        actualAmount = childrenMovie.getAmount(RENTED_DAYS_GREATER_THAN_THREE);
        expectedAmount = EXPECTED_CHILDREN_LESS_OR_EQUAL_THREE_RENTED_DAYS + (RENTED_DAYS_GREATER_THAN_THREE - RENTED_DAYS_IS_THREE) * AMOUNT_FACTOR_CHILDREN;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

}

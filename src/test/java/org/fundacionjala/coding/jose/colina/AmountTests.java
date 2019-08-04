package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmountTests {
    private int rentedDays;
    private static NewReleaseMovie newReleaseMovie;
    private static RegularMovie regularMovie;
    private static ChildrenMovie childrenMovie;
    private double actualAmount;
    private double expectedAmount;

    @BeforeClass
    public static void setUpClass(){
        newReleaseMovie =  new NewReleaseMovie("new release");
        regularMovie =  new RegularMovie("regular");
        childrenMovie =  new ChildrenMovie("children");
    }

    @Test
    public void testGetAmountNewReleaseMovieWith2DaysRented() {
        rentedDays = 2;
        actualAmount = newReleaseMovie.getAmount(rentedDays);
        expectedAmount = rentedDays*3;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountRegularMovieLessThan2DaysRented() {
        actualAmount = regularMovie.getAmount(rentedDays);
        expectedAmount = 2;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }
    @Test
    public void testGetAmountRegularMovieWith2DaysRented() {
        rentedDays = 2;
        actualAmount = regularMovie.getAmount(rentedDays);
        expectedAmount = 2;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountRegularMovieGreaterThan2DaysRented() {
        rentedDays = 3;
        actualAmount = regularMovie.getAmount(rentedDays);
        expectedAmount = 2 + (rentedDays - 2)*1.5;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountChildrenMovieLessThan3DaysRented() {
        rentedDays = 2;
        actualAmount = childrenMovie.getAmount(rentedDays);
        expectedAmount = 1.5;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }
    @Test
    public void testGetAmountChildrenMovieWith3DaysRented() {
        rentedDays = 3;
        actualAmount = childrenMovie.getAmount(rentedDays);
        expectedAmount = 1.5;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

    @Test
    public void testGetAmountChildrenMovieGreaterThan3DaysRented() {
        rentedDays = 5;
        actualAmount = childrenMovie.getAmount(rentedDays);
        expectedAmount = 1.5 + (rentedDays -3)*1.5;
        Assert.assertEquals(expectedAmount, actualAmount, 0);
    }

}

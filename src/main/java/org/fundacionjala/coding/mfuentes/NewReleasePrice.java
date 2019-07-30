package org.fundacionjala.coding.mfuentes;

public class NewReleasePrice implements Price {
    private static final double MOVIE_COST = 3;

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double amount(int daysRented) {
        return (daysRented * MOVIE_COST);
    }

    @Override
    public int renterPoints(int daysRented) {
        int day = 1;
        int day1 = 2;
        return (daysRented > day) ? day1 : day;
    }
}

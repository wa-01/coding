package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice implements Price {
    private static double MOVIE_COST = 1.5;
    private static final double MOVIE_DAYS = 3;

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double amount(int daysRented) {

        if (daysRented > MOVIE_DAYS) {
            MOVIE_COST += (daysRented - MOVIE_DAYS) * MOVIE_COST;
        }
        return MOVIE_COST;
    }
}

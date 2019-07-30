package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice implements Price {
    private static double movieCost = 1.5;
    private static final double MOVIE_DAYS = 3;

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double amount(int daysRented) {

        if (daysRented > MOVIE_DAYS) {
            movieCost += (daysRented - MOVIE_DAYS) * movieCost;
        }
        return movieCost;
    }
}

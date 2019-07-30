package org.fundacionjala.coding.mfuentes;

public class RegularPrice implements Price {

    private static final double MOVIE_COST = 2.00;
    private static final double MOVIE_COST_PER_DAY = 1.5;

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double amount(int daysRented) {

        double thisAmount = MOVIE_COST;
        if (daysRented > MOVIE_COST) {
            thisAmount += (daysRented - MOVIE_COST) * MOVIE_COST_PER_DAY;

        }
        return thisAmount;
    }
}

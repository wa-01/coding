package org.fundacionjala.coding.mmendieta;

public class MovieRegular extends Movie {

    static final double MOVIE_COST = 2.00;
    static final double MOVIE_COST_PER_DAY = 1.5;

    public MovieRegular(final String title) {
        super(title);
    }

    @Override
    public double getAmountOwed(int daysRented) {
        double thisAmount = MOVIE_COST;
        if (daysRented > 2) {
            thisAmount += (daysRented - 2) * MOVIE_COST_PER_DAY;
        }
        return thisAmount;
    }
}

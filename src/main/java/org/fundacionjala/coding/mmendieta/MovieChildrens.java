package org.fundacionjala.coding.mmendieta;

public class MovieChildrens extends Movie {

    static final double MOVIE_COST = 1.5;
    static final double MOVIE_DAYS = 3;

    public MovieChildrens(final String title) {
        super(title);
    }

    @Override
    double getAmountOwed(int daysRented) {
        double thisAmount = MOVIE_COST;
        if (daysRented > MOVIE_DAYS) {
            thisAmount += (daysRented - MOVIE_DAYS) * MOVIE_COST;
        }
        return thisAmount;
    }
}

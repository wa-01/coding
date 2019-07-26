package org.fundacionjala.coding.mmendieta;

public class MovieNewRelease extends Movie {
    static final double MOVIE_COST = 3;

    public MovieNewRelease(final String title) {
        super(title);
    }

    @Override
    public double getAmountOwed(int daysRented) {
        return daysRented * MOVIE_COST;
    }
}

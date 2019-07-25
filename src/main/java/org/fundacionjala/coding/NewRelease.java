package org.fundacionjala.coding;

public class NewRelease extends Price {

    private static final int FACTOR = 3;
    public NewRelease() {
        super(Movie.NEW_RELEASE);
    }

    @Override
    double getAmount(int daysRented) {
        return (double) (daysRented * FACTOR);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

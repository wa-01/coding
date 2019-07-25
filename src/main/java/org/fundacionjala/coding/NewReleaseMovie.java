package org.fundacionjala.coding;

public class NewReleaseMovie extends AMovie {

    private static final int FACTOR = 3;

    public NewReleaseMovie(final String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        return daysRented * FACTOR;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

package org.fundacionjala.coding;

public class NewRelease extends Price {

    public NewRelease() {
        super(Movie.NEW_RELEASE);
    }

    @Override
    double getAmount(int daysRented) {
        return (double) (daysRented * 3);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

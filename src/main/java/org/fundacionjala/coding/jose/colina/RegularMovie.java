package org.fundacionjala.coding.jose.colina;

public class RegularMovie extends Movie {
    private static final int FREQUENT_POINTS = 1;
    private static final double AMOUNT_FACTOR = 1.5;

    public RegularMovie(final String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * AMOUNT_FACTOR;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return FREQUENT_POINTS;
    }
}

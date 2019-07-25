package org.fundacionjala.coding;

public class RegularMovie extends AMovie {

    private static final double FACTOR = 1.5;

    public RegularMovie(final String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * FACTOR;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

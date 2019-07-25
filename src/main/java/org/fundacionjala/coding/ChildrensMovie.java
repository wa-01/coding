package org.fundacionjala.coding;

public class ChildrensMovie extends AMovie {

    private static final double AMOUNT_FACTOR = 1.5;
    private static final int DAYS = 3;

    public ChildrensMovie(final String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = AMOUNT_FACTOR;
        if (daysRented > DAYS) {
            amount += (daysRented - DAYS) * AMOUNT_FACTOR;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

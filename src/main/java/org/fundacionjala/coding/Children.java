package org.fundacionjala.coding;

public class Children extends Price {

    private static final double AMOUNT_FACTOR = 1.5;
    private static final int DAYS = 3;

    public Children() {
        super(Movie.CHILDREN);
    }

    @Override
    double getAmount(int daysRented) {
        double amount = AMOUNT_FACTOR;
        if (daysRented > DAYS) {
            amount += (daysRented - DAYS) * AMOUNT_FACTOR;
        }
        return amount;
    }
}

package org.fundacionjala.coding.jose.colina;

public class ChildrenMovie extends Movie {
    private static final int FREQUENT_POINTS = 1;
    private static final int DAYS_FOR_MINIMUM_AMOUNT = 3;
    private static final double AMOUNT_FACTOR = 1.5;
    private static final double MINIMUM_AMOUNT = 1.5;

    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = MINIMUM_AMOUNT;
        if (daysRented > DAYS_FOR_MINIMUM_AMOUNT) {
            amount += (daysRented - DAYS_FOR_MINIMUM_AMOUNT) * AMOUNT_FACTOR;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return FREQUENT_POINTS;
    }
}

package org.fundacionjala.coding.jose.colina;

public class NewReleaseMovie extends Movie {
    private static final int FREQUENT_POINTS = 1;
    private static final int BONUS = 1;
    private static final int AMOUNT_FACTOR = 3;
    private static final int MINIMUM_DAYS_FOR_BONUS = 1;

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = daysRented * AMOUNT_FACTOR;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > MINIMUM_DAYS_FOR_BONUS) {
            return FREQUENT_POINTS + BONUS;
        } else {
            return FREQUENT_POINTS;
        }
    }
}

package org.fundacionjala.coding.jose.colina;

public class NewReleaseMovie extends Movie {
    private static final int FREQUENT_POINTS = 1;
    private static final int BONUS = 1;

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = daysRented * 3;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if(daysRented > 1) {
            return FREQUENT_POINTS + BONUS;
        } else {
            return FREQUENT_POINTS;
        }
    }
}

package org.fundacionjala.coding;

public class Regular extends Price {

    private static final double FACTOR = 1.5;

    public Regular() {
        super(Movie.REGULAR);
    }

    @Override
    double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * FACTOR;
        }
        return amount;
    }
}

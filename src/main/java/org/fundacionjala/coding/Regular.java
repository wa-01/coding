package org.fundacionjala.coding;

public class Regular extends Price {

    public Regular() {
        super(Movie.REGULAR);
    }

    @Override
    double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}

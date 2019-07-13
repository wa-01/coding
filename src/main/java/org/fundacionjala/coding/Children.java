package org.fundacionjala.coding;

public class Children extends Price {

    public Children() {
        super(Movie.CHILDREN);
    }

    @Override
    double getAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }
}

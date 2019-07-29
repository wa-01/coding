package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    public double amount(int daysRented) {
        int day = 3;
        double thisAmount = 1.5;
        if (daysRented > day)
            thisAmount += (daysRented - day) * thisAmount;
        return thisAmount;
    }
}

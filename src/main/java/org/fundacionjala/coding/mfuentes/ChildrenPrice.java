package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
    @Override
    public double amount(int daysRented) {
        int day = 3;
        double thisAmount = 1.5;
        if (daysRented > day)
            thisAmount += (daysRented - day) * thisAmount;
        return thisAmount;
    }
}

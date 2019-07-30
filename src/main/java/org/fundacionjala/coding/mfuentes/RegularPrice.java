package org.fundacionjala.coding.mfuentes;

public class RegularPrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
    @Override
    public double amount(int daysRented) {
        int day = 2;
        double thisAmount = day;
        if (daysRented > day) {
            thisAmount += (daysRented - day) * 1.5;

        }
        return thisAmount;
    }
}
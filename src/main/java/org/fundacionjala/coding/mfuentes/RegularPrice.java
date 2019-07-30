package org.fundacionjala.coding.mfuentes;

public class RegularPrice implements Price {

    private static final double movieCost = 2.00;
    private static final double movieCostPerDay = 1.5;

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double amount(int daysRented) {

        double thisAmount = movieCost;
        if (daysRented > movieCost) {
            thisAmount += (daysRented - movieCost) * movieCostPerDay;

        }
        return thisAmount;
    }
}
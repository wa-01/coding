package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice implements Price {
    private static double movieCost = 1.5;
    private static final double movieDays = 3;

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double amount(int daysRented) {

        if (daysRented > movieDays) {
            movieCost += (daysRented - movieDays) * movieCost;
        }
        return movieCost;
    }
}

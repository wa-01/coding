package org.fundacionjala.coding.acamacho;

public class RegularPrice implements IPrice {
    private static final double INTEREST = 1.5;
    private static final int MAX_DAYS = 2;

    @Override
    public double amount(int daysRented) {
        double amount = 2;
        if (daysRented > MAX_DAYS) {
            amount += (daysRented - MAX_DAYS) * INTEREST;
        }
        return amount;
    }
}

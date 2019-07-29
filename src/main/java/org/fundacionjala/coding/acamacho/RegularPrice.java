package org.fundacionjala.coding.acamacho;

public class RegularPrice implements IPrice {
    private final static double INTEREST = 1.5;
    private final static int MAX_DAYS = 2;

    @Override
    public double amount(int daysRented) {
        double amount = 2;
        if (daysRented > MAX_DAYS) {
            amount += (daysRented - MAX_DAYS) * INTEREST;
        }
        return amount;
    }
}

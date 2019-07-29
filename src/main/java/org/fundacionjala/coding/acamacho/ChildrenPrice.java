package org.fundacionjala.coding.acamacho;

public class ChildrenPrice implements IPrice {
    private final static double INTEREST = 1.5;
    private final static double MAX_DAYS = 3;

    @Override
    public double amount(int daysRented) {
        double amount = 1.5;
        if (daysRented > MAX_DAYS) {
            amount += (daysRented - MAX_DAYS) * INTEREST;
        }
        return amount;
    }
}

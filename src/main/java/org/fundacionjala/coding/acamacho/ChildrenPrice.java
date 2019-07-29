package org.fundacionjala.coding.acamacho;

public class ChildrenPrice implements IPrice {
    private static final double INTEREST = 1.5;
    private static final double MAX_DAYS = 3;
    private static final double AMOUNT = 1.5;

    @Override
    public double amount(int daysRented) {
        double amount = AMOUNT;
        if (daysRented > MAX_DAYS) {
            amount += (daysRented - MAX_DAYS) * INTEREST;
        }
        return amount;
    }
}

package org.fundacionjala.coding.acamacho;

public class RegularPrice implements IPrice {
    @Override
    public double amount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}

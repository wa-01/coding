package org.fundacionjala.coding.acamacho;

public class ChildrenPrice implements IPrice {
    @Override
    public double amount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) *1.5;
        }
        return amount;
    }
}

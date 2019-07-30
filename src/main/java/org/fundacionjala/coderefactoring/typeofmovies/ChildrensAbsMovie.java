package org.fundacionjala.coderefactoring.typeofmovies;

import org.fundacionjala.coderefactoring.AbsMovie;

public class ChildrensAbsMovie extends AbsMovie {
    private static final double BASE_AMOUNT = 1.5;
    private static final double DAYS_EXCEEDED = 3;

    public ChildrensAbsMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double amount = BASE_AMOUNT;
        if (daysRented > DAYS_EXCEEDED)
            amount += (daysRented - DAYS_EXCEEDED) * BASE_AMOUNT;
        return amount;
    }
}

package org.fundacionjala.coderefactoring.typeofmovies;

import org.fundacionjala.coderefactoring.AbsMovie;

public class RegularAbsMovie extends AbsMovie {
    private static final double BASE_AMOUNT = 2;
    private static final double DAYS_EXCEEDED = 2;
    private static final double AMOUNT_FOR_EXCESS_DAYS = 1.5;

    public RegularAbsMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double amount = BASE_AMOUNT;
        if (daysRented > DAYS_EXCEEDED)
            amount += (daysRented - DAYS_EXCEEDED) * AMOUNT_FOR_EXCESS_DAYS;
        return amount;
    }
}

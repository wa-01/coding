package org.fundacionjala.coderefactoring.typeofmovies;

import org.fundacionjala.coderefactoring.AbsMovie;

public class NewReleaseAbsMovie extends AbsMovie {
    private static final double BASE_AMOUNT = 3;

    public NewReleaseAbsMovie(final String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        return daysRented * BASE_AMOUNT;
    }
}

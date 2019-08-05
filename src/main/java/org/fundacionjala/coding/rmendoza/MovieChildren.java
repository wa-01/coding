package org.fundacionjala.coding.rmendoza;

import static org.fundacionjala.coding.rmendoza.Amount.ALLOWED_CHILDREN_RENTAL_DAYS;
import static org.fundacionjala.coding.rmendoza.Amount.CHILDREN_AMOUNT;
import static org.fundacionjala.coding.rmendoza.Amount.CHILDREN_DAILY_CHARGE;

public class MovieChildren extends Movie {

    public MovieChildren(final String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        double amountOwed = CHILDREN_AMOUNT;
        if (daysRented > ALLOWED_CHILDREN_RENTAL_DAYS) {
            amountOwed += (daysRented - ALLOWED_CHILDREN_RENTAL_DAYS) * CHILDREN_DAILY_CHARGE;
        }
        return amountOwed;
    }

    @Override
    int getFrequentRenterPoints() {
        return 1;
    }
}

package org.fundacionjala.coding.rmendoza;

import static org.fundacionjala.coding.rmendoza.Amount.ALLOWED_REGULAR_RENTAL_DAYS;
import static org.fundacionjala.coding.rmendoza.Amount.REGULAR_AMOUNT;
import static org.fundacionjala.coding.rmendoza.Amount.REGULAR_DAILY_CHARGE;

public class MovieRegular extends Movie {

    public MovieRegular(final String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        double amountOwed = REGULAR_AMOUNT;
        if (daysRented > ALLOWED_REGULAR_RENTAL_DAYS) {
            amountOwed += (daysRented - ALLOWED_REGULAR_RENTAL_DAYS) * REGULAR_DAILY_CHARGE;
        }
        return amountOwed;
    }

    @Override
    int getFrequentRenterPoints() {
        return 1;
    }
}

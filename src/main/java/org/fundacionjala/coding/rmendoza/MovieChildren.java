package org.fundacionjala.coding.rmendoza;

public class MovieChildren extends Movie {

    private Amount amount;

    public MovieChildren(String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        amount = new Amount();
        double amountOwed = amount.CHILDREN_AMOUNT;
        if(daysRented > amount.ALLOWED_CHILDREN_RENTAL_DAYS) {
            amountOwed += (daysRented - amount.ALLOWED_CHILDREN_RENTAL_DAYS)*amount.CHILDREN_DAILY_CHARGE;
        }
        return amountOwed;
    }

    @Override
    int getFrequentRenterPoints(){
        return 1;
    }
}

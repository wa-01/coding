package org.fundacionjala.coding.mmendieta;

abstract class Movie {
    //public static final int CHILDRENS = 2;
    //public static final int REGULAR = 0;
    //public static final int NEW_RELEASE = 1;
    private final String title;
    //private int priceCode;

    Movie(final String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    abstract double getAmountOwed(int daysRented);
}

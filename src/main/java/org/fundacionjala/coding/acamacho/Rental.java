package org.fundacionjala.coding.acamacho;

class Rental {
    private Movie movie;
    private int daysRented;

    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double calculateAmount() {
        return getMovie().amountCategoryPrice(getDaysRented());
    }

}

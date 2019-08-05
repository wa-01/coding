package org.fundacionjala.coding.rmendoza;

class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getFrequentRentalPoints() {
        if (daysRented > 1) {
            return movie.getFrequentRenterPoints();
        } else {
            return 1;
        }
    }
}

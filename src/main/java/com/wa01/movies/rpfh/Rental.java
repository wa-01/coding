package com.wa01.movies.rpfh;

class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

}
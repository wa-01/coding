package com.wa01.movies.rpfh;

class Rental {
    private final Movie movie;
    private int daysRented;

    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

}

package com.wa01.movies.rpfh;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    /*public void setMovie(Movie movie) {
        _movie = movie;
    }

    public void setDaysRented(int daysRented) {
        _daysRented = daysRented;
    }*/

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public String getMovieTitle (){
        return _movie.getTitle();
    }

}

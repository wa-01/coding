package com.wa01.movies.rpfh;

public abstract class Movie {
    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public abstract double getPrice(int daysRented);

    public abstract int getPoints(int daysRented);

}

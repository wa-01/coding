package com.wa01.movies.rpfh;

public abstract class Movie {
    private final String title;

    public Movie(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int daysRented);

    public abstract int getPoints(int daysRented);

}

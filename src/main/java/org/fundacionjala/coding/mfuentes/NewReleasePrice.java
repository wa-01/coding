package org.fundacionjala.coding.mfuentes;

public class NewReleasePrice extends Price {
    public NewReleasePrice () {
        super(Movie.NEW_RELEASE);
    }
    public double amount ( int daysRented ) {
        return (double)(daysRented * 3);
    }

    public int renterPoints ( int daysRented ){
        if (daysRented > 1)
            return 2;
        else
            return 1;
    }
}

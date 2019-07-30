package org.fundacionjala.coderefactoring;

import org.fundacionjala.coderefactoring.typeofmovies.NewReleaseAbsMovie;

public class Rental {
    private AbsMovie absMovie;
    private int rentedDays;

    public Rental(AbsMovie absMovie, int rentedDays) {
        this.absMovie = absMovie;
        this.rentedDays = rentedDays;
    }

    public String getMovieTitle() {
        return absMovie.getTitle();
    }

    public int getRenterPoints() {
        return (isNewRelease(absMovie) && isRentedForMoreThanOneDay()) ? 2 : 1;
    }

    private boolean isNewRelease(AbsMovie absMovie) {
        return (absMovie instanceof NewReleaseAbsMovie);
    }

    private boolean isRentedForMoreThanOneDay() {
        return rentedDays > 1;
    }

    public double getAmount() {
        return absMovie.getPrice(rentedDays);
    }
}

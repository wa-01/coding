package org.fundacionjala.coderefactoring;

import org.fundacionjala.coderefactoring.typeofmovies.ChildrensAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.NewReleaseAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.RegularAbsMovie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Rental rental;
    private static final int DAYS_RENTED_REGULAR = 2;
    private static final int DAYS_RENTED_RELEASE = 2;
    private static final int DAYS_RENTED_CHILDREN = 2;
    private static final int DAYS_RENTED_REGULAR_DELTA = 3;
    private static final int DAYS_RENTED_RELEASE_DELTA = 3;
    private static final int DAYS_RENTED_CHILDREN_DELTA = 3;
    private static final double DAYS_RENTED_REGULAR_EXPECTED = 3.5;
    private static final int DAYS_RENTED_RELEASE_EXPECTED = 9;
    private static final double DAYS_RENTED_CHILDREN_EXPECTED = 1.5;


    @Test
    public void returnRenterPointsForNewReleaseMovieRentedForMoreThanADay() {
        rental = new Rental(new NewReleaseAbsMovie("toy Story 4"), DAYS_RENTED_RELEASE);

        assertEquals(2, rental.getRenterPoints());
    }

    @Test
    public void returnRenterPointsForARegularMovie() {
        rental = new Rental(new RegularAbsMovie("la lista de Schindler"), DAYS_RENTED_REGULAR);

        assertEquals(1, rental.getRenterPoints());
    }

    @Test
    public void returnRenterPointsForAChildrenMovie() {
        rental = new Rental(new ChildrensAbsMovie("toy Story 3"), DAYS_RENTED_CHILDREN);

        assertEquals(1, rental.getRenterPoints());
    }

    @Test
    public void returnRentalAmountForARegularMovie() {
        rental = new Rental(new RegularAbsMovie("La bicicleta de los huanca"), DAYS_RENTED_REGULAR_DELTA);

        assertEquals(DAYS_RENTED_REGULAR_EXPECTED, rental.getAmount(), 0.0);
    }

    @Test
    public void returnRentalAmountForANewReleaseMovie() {
        rental = new Rental(new NewReleaseAbsMovie("Aladin"), DAYS_RENTED_RELEASE_DELTA);

        assertEquals(DAYS_RENTED_RELEASE_EXPECTED, rental.getAmount(), 0.0);
    }

    @Test
    public void returnRentalAmountForAChildrenMovie() {
        rental = new Rental(new ChildrensAbsMovie("toy Story 4"), DAYS_RENTED_CHILDREN_DELTA);

        assertEquals(DAYS_RENTED_CHILDREN_EXPECTED, rental.getAmount(), 0.0);
    }
}

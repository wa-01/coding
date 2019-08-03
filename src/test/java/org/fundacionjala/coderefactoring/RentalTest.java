package org.fundacionjala.coderefactoring;

import org.fundacionjala.coderefactoring.typeofmovies.ChildrensAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.NewReleaseAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.RegularAbsMovie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Rental rental;

    @Test
    public void returnRenterPointsForNewReleaseMovieRentedForMoreThanADay() {
        rental = new Rental(new NewReleaseAbsMovie("toy Story 4"), 2);

        assertEquals(2, rental.getRenterPoints());
    }

    @Test
    public void returnRenterPointsForARegularMovie() {
        rental = new Rental(new RegularAbsMovie("la lista de Schindler"), 2);

        assertEquals(1, rental.getRenterPoints());
    }

    @Test
    public void returnRenterPointsForAChildrenMovie() {
        rental = new Rental(new ChildrensAbsMovie("toy Story 3"), 2);

        assertEquals(1, rental.getRenterPoints());
    }

    @Test
    public void returnRentalAmountForARegularMovie() {
        rental = new Rental(new RegularAbsMovie("La bicicleta de los huanca"), 3);

        assertEquals(3.5, rental.getAmount(), 0.0);
    }

    @Test
    public void returnRentalAmountForANewReleaseMovie() {
        rental = new Rental(new NewReleaseAbsMovie("Aladin"), 3);

        assertEquals(9, rental.getAmount(), 0.0);
    }

    @Test
    public void returnRentalAmountForAChildrenMovie() {
        rental = new Rental(new ChildrensAbsMovie("toy Story 4"), 3);

        assertEquals(1.5, rental.getAmount(), 0.0);
    }
}
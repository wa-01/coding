package org.fundacionjala.coderefactoring;

import org.fundacionjala.coderefactoring.typeofmovies.ChildrensAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.NewReleaseAbsMovie;
import org.fundacionjala.coderefactoring.typeofmovies.RegularAbsMovie;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private static final int DAYS_RENTED_REGULAR = 5;
    private static final int DAYS_RENTED_RELEASE = 2;
    private static final int DAYS_RENTED_CHILDREN = 3;
    private static final double AMMOUNT_CHILDREN = 1.5;
    private static final Double AMMOUNT_NEW_RELEASE = 6.0;
    private static final double AMMOUNT_REGULAR = 6.5;

    @Test
    public void returnCustomersStatementGivenAListOfRentals() {
        Rental insideOut = new Rental(new NewReleaseAbsMovie("la lista de Schindler"), DAYS_RENTED_RELEASE);
        Rental zootopia = new Rental(new ChildrensAbsMovie("toy Story 4"), DAYS_RENTED_CHILDREN);
        Rental avengers = new Rental(new RegularAbsMovie("Avengers"), DAYS_RENTED_REGULAR);
        List<Rental> rentals = Arrays.asList(insideOut, zootopia, avengers);
        customer = new Customer("Edgar", rentals);

        StringBuilder expectedStatement = new StringBuilder();
        expectedStatement.append("Rental record for Edgar\n");
        appendRental(expectedStatement, "la lista de Schindler", AMMOUNT_NEW_RELEASE);
        appendRental(expectedStatement, "toy Story 4", AMMOUNT_CHILDREN);
        appendRental(expectedStatement, "Avengers", AMMOUNT_REGULAR);
        expectedStatement.append("Amount owed is 14.0\n");
        expectedStatement.append("You earned 4 frequent renter points");

        assertEquals(expectedStatement.toString(), customer.statement());
    }

    @Test
    public void returnCustomersStatementGivenNoRentals() {
        customer = new Customer("Edgar", Collections.<Rental>emptyList());

        StringBuilder expectedStatement = new StringBuilder();
        expectedStatement.append("Rental record for Edgar\n");
        expectedStatement.append("Amount owed is 0.0\n");
        expectedStatement.append("You earned 0 frequent renter points");

        assertEquals(expectedStatement.toString(), customer.statement());
    }

    private void appendRental(final StringBuilder statement,final String movie, double amount) {
        statement.append("\t").append(movie).append("\t").append(amount).append("\n");
    }
}

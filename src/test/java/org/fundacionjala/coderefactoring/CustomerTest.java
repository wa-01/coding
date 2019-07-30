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

    @Test
    public void returnCustomersStatementGivenAListOfRentals() {
        Rental insideOut = new Rental(new NewReleaseAbsMovie("la lista de Schindler"), 2);
        Rental zootopia = new Rental(new ChildrensAbsMovie("toy Story 4"), 3);
        Rental avengers = new Rental(new RegularAbsMovie("Avengers"), 5);
        List<Rental> rentals = Arrays.asList(insideOut, zootopia, avengers);
        customer = new Customer("Edgar", rentals);

        StringBuilder expectedStatement = new StringBuilder();
        expectedStatement.append("Rental record for Edgar\n");
        appendRental(expectedStatement, "la lista de Schindler", 6.0);
        appendRental(expectedStatement, "toy Story 4", 1.5);
        appendRental(expectedStatement, "Avengers", 6.5);
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

    private void appendRental(StringBuilder statement, String movie, double amount) {
        statement.append("\t").append(movie).append("\t").append(amount).append("\n");
    }
}

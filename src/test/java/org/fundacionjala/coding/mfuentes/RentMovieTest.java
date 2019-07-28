package org.fundacionjala.coding.mfuentes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RentMovieTest {

    private Customer customer;

    public void setUp() {
        Customer customer = new Customer("Magali");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 1), 4));
    }

    @Test
    public void MovieRentalAddRentalTest() {
        Customer customer2 = new Customer("Magali");
        Movie movie1 = new Movie("Gone with the Wind", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 3); // 3 day rental
        customer2.addRental(rental1);
    }

    @Test
    public void MovieRentalGetCustomerNameTest() {
        Customer c = new Customer("Magali");
        assertEquals("Magali", c.getName());
    }


//    @Test
//    public void MovieRentalCustomerTest() {
//        Customer c = new CustomerBuilder().build();
//        assertNotNull(c);
//    }
//
//

    @Test
    public void statementForRegularMovie() {
//        Movie movie1 = new Movie("Gone with the Wind", Movie.REGULAR);
//        Rental rental1 = new Rental(movie1, 3); // 3 day rental
//        Customer customer2 = new Customer("Magali");
        String expected = "Rental Record for Magali\n" +
                "\tGone with the Wind\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void statementForNewReleaseMovie() {
        Movie movie1 = new Movie("Star Wars", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 3); // 3 day rental
        Customer customer2 =
                new Customer("Magali");
        String expected = "Rental Record for Sallie\n" +
                "\tStar Wars\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";
        String statement = customer2.statement();
        assertEquals(expected, statement);
    }

    @Test
    public void statementForChildrensMovie() {
        Movie movie1 = new Movie("Madagascar", Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 3); // 3 day rental
        Customer customer2 = new Customer("Magali");
        String expected = "Rental Record for Sallie\n" +
                "\tMadagascar\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        String statement = customer2.statement();
        assertEquals(expected, statement);
    }

}

package org.fundacionjala.coding;

import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Lizzy");
    }

    @Test
    public void getStatement_NoRental_ResultDefaultStatement(){
        String expected = "Rental Record for Lizzy\n" +
                          "Amount owed is 0.0\n" +
                          "You earned 0 frequent renter points";
        String actual = customer.getStatement();

        assertEquals(expected, actual);
    }

    @Test
    public void getStatement_OneMovieChildren_resultChildrenStatement() {
        customer.addRental(new Rental(new Movie("El Rey Leon", new Children()), 3));
        String actual = customer.getStatement();
        String expected = "Rental Record for Lizzy\n"+
                "\tEl Rey Leon\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void getStatement_TwoMoviesNewReleaseRegular_resultNewReleaseRegularStatement() {
        customer.addRental(new Rental(new Movie("The Revenant", new NewRelease()), 2));
        customer.addRental(new Rental(new Movie("Terminator", new Regular()), 2));
        String actual = customer.getStatement();
        String expected = "Rental Record for Lizzy\n"+
                        "\tThe Revenant\t6.0\n" +
                        "\tTerminator\t2.0\n" +
                        "Amount owed is 8.0\n" +
                        "You earned 3 frequent renter points";

        assertEquals(expected, actual);
    }
}

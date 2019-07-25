package org.fundacionjala.coding;

import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;
    private AMovie children1;
    // private AMovie children2;
    private AMovie newRelease1;
    // private AMovie newRelease2;
    private AMovie regular1;
    // private AMovie regular2;

    @Before
    public void setUp() {
        customer = new Customer("Lizzy");
        children1 = new ChildrensMovie("El Rey Leon");
        // children2 = new ChildrensMovie("El Rey Leon 2");
        newRelease1 =  new NewReleaseMovie("The Revenant");
        // newRelease2 =  new NewReleaseMovie("The Revenant 2");
        regular1 = new RegularMovie("Terminator");
        // regular2 = new RegularMovie("Terminator 2");
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
        customer.addRental(new Rental(children1, 3));
        String actual = customer.getStatement();
        String expected = "Rental Record for Lizzy\n"+
                "\tEl Rey Leon\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void getStatement_TwoMoviesNewReleaseRegular_resultNewReleaseRegularStatement() {
        customer.addRental(new Rental(newRelease1, 2));
        customer.addRental(new Rental(regular1, 2));
        String actual = customer.getStatement();
        String expected = "Rental Record for Lizzy\n"+
                        "\tThe Revenant\t6.0\n" +
                        "\tTerminator\t2.0\n" +
                        "Amount owed is 8.0\n" +
                        "You earned 3 frequent renter points";

        assertEquals(expected, actual);
    }
}

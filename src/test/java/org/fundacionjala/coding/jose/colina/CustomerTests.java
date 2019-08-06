package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CustomerTests {
    private static final int CHILDREN_DAYS_RENTED = 5;
    private static final int REGULAR_DAYS_RENTED = 2;
    private static final int NEW_RELEASE_DAYS_RENTED = 2;
    private Customer customer;
    private static ByteArrayOutputStream consoleOutput;
    private static PrintStream newPrintStream;
    private static PrintStream oldPrintStream;

    private static void changePrintConsoleStream() {
        consoleOutput = new ByteArrayOutputStream();
        newPrintStream = new PrintStream(consoleOutput);
        oldPrintStream = System.out;
        System.setOut(newPrintStream);
    }

    private void restorePrintConsoleStream() {
        System.out.flush();
        System.setOut(oldPrintStream);
    }
    @Test
    public void testGetName() {
        String expectedName = "Pedro Picapiedra";
        customer = new Customer(expectedName);
        String actualName = customer.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testStatementWith3MovieTypes() {
        changePrintConsoleStream();
        customer = new Customer("Pedro Picapiedra");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), NEW_RELEASE_DAYS_RENTED));
        customer.addRental(new Rental(new RegularMovie("Terminator"), REGULAR_DAYS_RENTED));
        customer.addRental(new Rental(new ChildrenMovie("Snow White"), CHILDREN_DAYS_RENTED));
        customer.statement();
        String expectedStatement = "Rental Record for Pedro Picapiedra"
                + System.lineSeparator()
                + "\tThe Revenant\t6.0"
                + System.lineSeparator()
                + "\tTerminator\t2.0"
                + System.lineSeparator()
                + "\tSnow White\t4.5"
                + System.lineSeparator()
                + "Amount owed is 12.5"
                + System.lineSeparator()
                + "You earned 4 frequent renter points"
                + System.lineSeparator();
        String actualStatement = consoleOutput.toString();
        Assert.assertEquals(expectedStatement, actualStatement);
        restorePrintConsoleStream();
    }
}

package org.fundacionjala.coding.jose.colina;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CustomerTests {
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

    private void restorePrintConsoleStream(){
        System.out.flush();
        System.setOut(oldPrintStream);
    }
    @Test
    public void testGetName(){
        String expectedName = "Pedro Picapiedra";
        customer = new Customer(expectedName);
        String actualName = customer.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testStatementWith3MovieTypes(){
        changePrintConsoleStream();
        customer = new Customer("Pedro Picapiedra");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Snow White"), 5));
        customer.statement();
        String expectedStatement = "Rental Record for Pedro Picapiedra" + System.lineSeparator() +
                "\tThe Revenant\t6.0" + System.lineSeparator() +
                "\tTerminator\t2.0" + System.lineSeparator() +
                "\tSnow White\t4.5" + System.lineSeparator() +
                "Amount owed is 12.5" + System.lineSeparator() +
                "You earned 4 frequent renter points" + System.lineSeparator();
        String actualStatement = consoleOutput.toString();
        Assert.assertEquals(expectedStatement, actualStatement);
        restorePrintConsoleStream();
    }
}

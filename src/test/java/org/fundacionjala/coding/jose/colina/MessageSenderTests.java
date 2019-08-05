package org.fundacionjala.coding.jose.colina;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MessageSenderTests {
    private String expectedMessage;
    private String actualMessage;
    private static MessagesSender messagesSender;
    private static ByteArrayOutputStream consoleOutput;
    private static PrintStream newPrintStream;
    private static PrintStream oldPrintStream;

    @Before
    public void setUp() {
        messagesSender = new MessagesSender();
        changePrintStream();
    }

    private static void changePrintStream() {
        consoleOutput = new ByteArrayOutputStream();
        newPrintStream = new PrintStream(consoleOutput);
        oldPrintStream = System.out;
        System.setOut(newPrintStream);
    }

    @After
    public void tearDown() {
        System.out.flush();
        System.setOut(oldPrintStream);
    }

    @Test
    public void testShowCustomerNameStatement() {
        String customerName = "Juan Perez";
        expectedMessage = "Rental Record for " + customerName + System.lineSeparator();
        messagesSender.showCustomerNameStatement(customerName);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testShowAmountOwned() {
        double amount = 10;
        expectedMessage = "Amount owed is " + amount + System.lineSeparator();
        messagesSender.showAmountOwned(amount);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testShowFrequentPointsEarned() {
        int frequentPoints = 7;
        expectedMessage = "You earned " + frequentPoints + " frequent renter points" + System.lineSeparator();
        messagesSender.showFrequentPointsEarned(frequentPoints);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testShowRental() {
        String title = "My movie";
        double amount = 7;
        expectedMessage = "\t" + title + "\t" + amount + System.lineSeparator();
        messagesSender.showRental(title, amount);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

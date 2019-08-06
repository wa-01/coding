package org.fundacionjala.coding.jose.colina;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MessageSenderTests {
    private static final double AMOUNT_FOR_RENTAL_TEST = 7;
    private static final double AMOUNT_FOR_AMOUNT_OWNED_TEST = 10;
    private static final int FREQUENT_POINTS = 7;
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
        expectedMessage = "Amount owed is " + AMOUNT_FOR_AMOUNT_OWNED_TEST + System.lineSeparator();
        messagesSender.showAmountOwned(AMOUNT_FOR_AMOUNT_OWNED_TEST);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testShowFrequentPointsEarned() {
        expectedMessage = "You earned " + FREQUENT_POINTS + " frequent renter points" + System.lineSeparator();
        messagesSender.showFrequentPointsEarned(FREQUENT_POINTS);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testShowRental() {
        String title = "My movie";
        expectedMessage = "\t" + title + "\t" + AMOUNT_FOR_RENTAL_TEST + System.lineSeparator();
        messagesSender.showRental(title, AMOUNT_FOR_RENTAL_TEST);
        actualMessage = consoleOutput.toString();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

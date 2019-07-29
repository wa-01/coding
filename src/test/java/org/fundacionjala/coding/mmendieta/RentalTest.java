package org.fundacionjala.coding.mmendieta;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    @Test
    public void testAddRental() {
        Movie movieTiburon = new MovieRegular("Tiburon");
        Rental rental = new Rental(movieTiburon, 1);
        Assert.assertEquals("Tiburon",
                rental.getMovie().getTitle());
    }
}

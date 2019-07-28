package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
    private Regular regular;
    private Release release;
    private Children children;

    @Before
    public void setUp() {
        regular = new Regular("Our Fault");
        release = new Release("Dark Phoenix");
        children = new Children("Lion King");
    }

    @Test
    public void movieHasTitle() {
        Assert.assertFalse(release.getTitle().isEmpty());
        Assert.assertFalse(regular.getTitle().isEmpty());
        Assert.assertFalse(children.getTitle().isEmpty());
    }

    @Test
    public void movieHasPrice() {
        Assert.assertTrue(release.getPrice(1) > 0);
        Assert.assertTrue(regular.getPrice(1)> 0);
        Assert.assertTrue(children.getPrice(1)> 0);
    }
}

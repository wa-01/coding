package com.wa01.movies.rpfh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
    private Movie movie;
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
    public void regularMovieIsAMovie() {
        Assert.assertTrue(regular instanceof Movie);
    }

    @Test
    public void releaseMovieIsAMovie() {
        Assert.assertTrue(release instanceof Movie);
    }

    @Test
    public void childrenMovieIsAMovie() {
        Assert.assertTrue(children instanceof Movie);
    }

    @Test
    public void movieHasTitle() {
        Assert.assertFalse(release.getTitle().isEmpty());
        Assert.assertFalse(regular.getTitle().isEmpty());
        Assert.assertFalse(children.getTitle().isEmpty());
    }

    @Test
    public void movieHasPrice() {
        //String title = "Zombieland II";
        Assert.assertTrue(release.getPrice(1) > 0);
        Assert.assertTrue(regular.getPrice(1)> 0);
        Assert.assertTrue(children.getPrice(1)> 0);
    }
}

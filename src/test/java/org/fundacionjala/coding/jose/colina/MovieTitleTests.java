package org.fundacionjala.coding.jose.colina;

import org.junit.Assert;
import org.junit.Test;

public class MovieTitleTests {
    private Movie movie;
    private String expectedTitle;
    private String actualTitle;

    @Test
    public void getTitleFromNewReleaseMovie(){
        expectedTitle = "new Release movie";
        movie = new NewReleaseMovie(expectedTitle);
        actualTitle = movie.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void getTitleFromRegularMovie(){
        expectedTitle = "regular movie";
        movie = new RegularMovie(expectedTitle);
        actualTitle = movie.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void getTitleFromChildrenMovie(){
        expectedTitle = "children movie";
        movie = new ChildrenMovie(expectedTitle);
        actualTitle = movie.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}

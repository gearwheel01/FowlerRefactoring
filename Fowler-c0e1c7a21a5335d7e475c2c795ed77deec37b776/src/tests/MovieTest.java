package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import classes.Movie;

public class MovieTest {

    private Movie movie;

    @Before
    public void createTestData()
    {
        movie = new Movie("Blockbuster",Movie.NEW_RELEASE);
    }

    @Test
    public void testPriceCode()
    {
        assertEquals(movie.getPrice(), Movie.NEW_RELEASE);
        movie.setPrice(Movie.CHILDRENS);
        assertEquals(movie.getPrice(), Movie.CHILDRENS);
    }

    @Test
    public void testTitle()
    {
        assertEquals(movie.getTitle(),"Blockbuster");
    }
}

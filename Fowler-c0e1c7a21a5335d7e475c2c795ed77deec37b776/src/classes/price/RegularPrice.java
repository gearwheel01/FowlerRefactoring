package classes.price;

import classes.Movie;

public class RegularPrice extends Price {

    public int getPriceCode() {
        return Movie.REGULAR;
    }

}
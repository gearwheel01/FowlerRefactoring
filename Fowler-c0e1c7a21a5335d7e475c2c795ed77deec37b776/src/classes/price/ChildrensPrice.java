package classes.price;

import classes.Movie;

public class ChildrensPrice extends Price {

    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

}
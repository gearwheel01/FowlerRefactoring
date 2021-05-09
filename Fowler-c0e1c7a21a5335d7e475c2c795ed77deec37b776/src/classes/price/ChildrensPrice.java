package classes.price;

import classes.Movie;

public class ChildrensPrice extends Price {

    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int days)
    {
        double result = 1.5;
        if (days > 3)
            result += (days - 3) * 1.5;
        return result;
    }

}
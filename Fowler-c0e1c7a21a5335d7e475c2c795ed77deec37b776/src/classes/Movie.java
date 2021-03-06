package classes;

import classes.price.*;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String newtitle, int newPriceCode) {
        title = newtitle;
        setPrice(newPriceCode);
    }

    public int getPrice() {
        return price.getPriceCode();
    }
    public void setPrice(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }
    public String getTitle (){
        return title;
    };

    public double getCharge(int days) {
        return price.getCharge(days);
    }

    public int getFrequentRenterPoints(int days) {
        return price.getFrequentRenterPoints(days);
    }
}
package sonica.it.com.sonica.domain;

/**
 * Created by SajidA on 01/11/2016.
 */

import android.support.v7.appcompat.R;

public class Category {

    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final Category[] drinks = {
            new Category("Latte", "A couple of espresso shots with steamed milk"),
            new Category("Cappuccino", "Espresso, hot milk, and a steamed milk foam"),
            new Category("Filter", "Highest quality beans roasted and brewed fresh")
    };
    //Each Drink has a name, description, and an image resource
    private Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return this.name;
    }
}

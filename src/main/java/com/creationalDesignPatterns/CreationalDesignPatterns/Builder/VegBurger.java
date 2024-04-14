package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

/*
Step 4
Create concrete classes extending Burger and ColdDrink classes

VegBurger.java
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}

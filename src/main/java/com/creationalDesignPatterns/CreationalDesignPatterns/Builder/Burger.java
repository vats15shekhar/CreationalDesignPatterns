package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

/*
Step 3
Create abstract classes Burger and ColdDrink implementing the item interface providing default functionalities.
 */
public abstract class Burger implements Item{
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}

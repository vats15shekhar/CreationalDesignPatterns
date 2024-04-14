package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}

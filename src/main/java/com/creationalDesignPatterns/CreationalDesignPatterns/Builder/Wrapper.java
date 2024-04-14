package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

/*
Step 2
Create concrete classes Wrapper and Bottle implementing the Packing interface.
 */
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}

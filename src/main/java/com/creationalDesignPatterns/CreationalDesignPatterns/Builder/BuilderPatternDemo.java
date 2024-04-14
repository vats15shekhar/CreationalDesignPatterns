package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

/*
Step 7
BuiderPatternDemo uses MealBuider to demonstrate builder pattern.

BuilderPatternDemo.java
 */
public class BuilderPatternDemo {


    public void demo()
    {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegmeal = mealBuilder.vegMeal();
        vegmeal.showItems();

        Meal nonvegmeal = mealBuilder.NonVegMeal();
        nonvegmeal.showItems();

    }






}

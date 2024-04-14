package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

/*
Step 6
Create a MealBuilder class, the actual builder class responsible to create Meal objects.
 */
public class MealBuilder {

    public Meal vegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

    public Meal NonVegMeal()
    {
        Meal meal1 = new Meal();
        meal1.addItem(new ChickenBurger());
        meal1.addItem(new Coke());

        return meal1;
    }
}

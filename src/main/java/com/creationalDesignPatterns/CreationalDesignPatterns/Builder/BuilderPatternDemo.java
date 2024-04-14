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
/*
When to use Builder Design Pattern?
The Builder design pattern is used when you need to create complex objects with a large number of
optional components or configuration parameters. This pattern is particularly useful when an object
needs to be constructed step by step, some of the scenarios where the Builder design pattern is beneficial are:

Complex Object Construction: When you have an object with many optional components or configurations and you want to provide a clear separation between the construction process and the actual representation of the object.
Step-by-Step Construction: When the construction of an object involves a step-by-step process where different configurations or options need to be set at different stages.
Avoiding constructors with multiple parameters: When the number of parameters in a constructor becomes too large, and using telescoping constructors (constructors with multiple parameters) becomes unwieldy and error-prone.
Immutable Objects: When you want to create immutable objects, and the Builder pattern allows you to construct the object gradually before making it immutable.
Configurable Object Creation: When you need to create objects with different configurations or variations, and you want a more flexible and readable way to specify these configurations.
Common Interface for Multiple Representations: When you want to provide a common interface for constructing different representations of an object.
When not to use Builder Design Pattern?
While the Builder design pattern is beneficial in many scenarios, there are situations where it might be unnecessary. Here are some cases when you might want to reconsider using the Builder pattern:

Simple Object Construction:
If the object you are constructing has only a few simple parameters or configurations, and the construction process is straightforward, using a builder might be overkill. In such cases, a simple constructor or static factory method might be more appropriate.
Performance Concerns:
In performance-critical applications, the additional overhead introduced by the Builder pattern might be a concern. The extra method calls and object creations involved in the builder process could impact performance, especially if the object construction is frequent and time-sensitive.
Immutable Objects with Final Fields:
If you are working with a language that supports immutable objects with final fields (e.g., Java’s final keyword), and the object’s structure is relatively simple, you might prefer using constructors with parameters or static factory methods.
Increased Code Complexity:
Introducing a builder class for every complex object can lead to an increase in code complexity. If the object being constructed is simple and doesn’t benefit significantly from a step-by-step construction process, using a builder might add unnecessary complexity to the codebase.
Tight Coupling with Product:
If the builder is tightly coupled with the product it constructs, and changes to the product require corresponding modifications to the builder, it might reduce the flexibility and maintainability of the code.
 */

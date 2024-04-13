package com.creationalDesignPatterns.CreationalDesignPatterns.Prototype;

public class PrototypePatternDemo {

    public void prototypedemo() throws CloneNotSupportedException {
        ShapeCache shapeCache = new ShapeCache();

        shapeCache.loadCache();

        Shape clonedShape = (Shape) shapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 =  ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = shapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}

package com.creationalDesignPatterns.CreationalDesignPatterns.Prototype;

import lombok.Getter;

/*
This pattern involves implementing a prototype interface which tells to create a clone of the current object.
This pattern is used when creation of object directly is costly. For example, an object is to be created after
a costly database operation. We can cache the object, returns its clone on next request and update the database
as and when needed thus reducing database calls.

We're going to create an abstract class Shape and concrete classes extending the Shape class.
A class ShapeCache is defined as a next step which stores shape objects in a Hashtable and returns their
clone when requested. PrototypPatternDemo, our demo class will use ShapeCache class to get a Shape object.
 */
@Getter
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        Object clone = null;

            clone = super.clone();

        return clone;
    }
}

/*

In Java, super.clone() is used to create a copy of an object using the clone method defined in the superclass.
This is typically used in classes that implement the Cloneable interface to create a shallow copy of the object.
 */
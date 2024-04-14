package com.creationalDesignPatterns.CreationalDesignPatterns.Builder;

import java.util.*;

/*
Step 5
Create a Meal class having Item objects defined above.
 */
public class Meal {

    private List<Item> itemList = new ArrayList<Item>();

    // Adding items into the List
    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public float getCost()
    {
        float cost = 0.0f;

        for(Item item : itemList)
        {
            cost += item.price();
        }

        return cost;
    }

    public void showItems()
    {
        for(Item item : itemList)
        {
            System.out.println("Item" + item.name());
            System.out.println("Packing" + item.packing());
            System.out.println("Price" + item.price());

        }
    }

}

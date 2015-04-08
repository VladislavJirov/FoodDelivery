package com.epam.vzhirov.fooddelivery.model;

public class Ingredient {

    private String name;
    private int calories; //per 100g

    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}

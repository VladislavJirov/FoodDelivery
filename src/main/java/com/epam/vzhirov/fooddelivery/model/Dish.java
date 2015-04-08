package com.epam.vzhirov.fooddelivery.model;

import java.util.*;

public class Dish {

    //TODO variable for image file
    private String name;
    private Map<Ingredient, Integer> ingredients;
    private String category; //TODO add categories (enum, or?)
    private String description;
    private int price;    //TODO replace int with decimal or create money class
    private int calories;

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Ingredient, Integer> getIngredients() {
        if (ingredients == null){return null;}  //check if list exists
        return ingredients;
    }

    public void setIngredients(Ingredient ingredient, Integer amount) {
        if (ingredients == null){ ingredients = new HashMap<Ingredient, Integer>();}
        ingredients.put(ingredient, amount);
        calculateCalories(); //TODO make sure if calories exists
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void removeIngreident(Ingredient ingredient){
        ingredients.remove(ingredient);
        calculateCalories();
    }

    private void calculateCalories(){
        this.calories = 0;
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            this.calories += entry.getKey().getCalories()*(entry.getValue()/100); //Pull calories from ingredient and multiply em for amount
        }
    }
}
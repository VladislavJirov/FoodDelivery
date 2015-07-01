package com.epam.vzhirov.fooddelivery.model;

import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class Dish {

    //image of dish should be find by UUID
    private String name;
    private List<Ingredient> ingredients;
    private Category category;
    private String description;
    private Money price;
    private int calories;
    private Boolean available;

    public Dish(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        if (this.ingredients == null) {
            return null;
        }
        return this.ingredients;
    }

    public void setIngredients(Ingredient ingredient, Integer amount) {
        if (this.ingredients == null) {
            this.ingredients = new ArrayList<>();
        }
        this.ingredients.add(ingredient);
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void removeIngreident(Ingredient ingredient) {
        if (this.ingredients != null) {
            ingredients.remove(ingredient);
        }
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
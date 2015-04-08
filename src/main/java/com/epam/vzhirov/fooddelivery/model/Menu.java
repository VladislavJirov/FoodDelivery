package com.epam.vzhirov.fooddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String name;
    private List<Dish> dishes = new ArrayList<Dish>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Dish dish) {
        this.dishes.add(dish);
    }
}

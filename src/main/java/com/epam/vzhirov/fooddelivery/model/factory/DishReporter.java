package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Dish;
import com.epam.vzhirov.fooddelivery.model.Ingredient;

import java.util.List;

public class DishReporter {
    public static void showDish(Dish dish){
        System.out.println("Name: " + dish.getName());
        List<Ingredient> ingredients = dish.getIngredients();
        for (Ingredient ingredient : ingredients) {
            System.out.println("Ingredient: " + ingredient.getName());
        }
        System.out.println("---");
    }
}

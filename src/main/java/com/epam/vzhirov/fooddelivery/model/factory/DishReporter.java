package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Dish;
import com.epam.vzhirov.fooddelivery.model.Ingredient;

import java.util.Map;

public class DishReporter {
    public static void showDish(Dish dish){
        System.out.println("Name: " + dish.getName());
        for (Map.Entry<Ingredient, Integer> entry : dish.getIngredients().entrySet()) {

            Ingredient ingredient = entry.getKey();
            System.out.println("Ingredient: " + ingredient.getName() + "    Amount: " +  entry.getValue() + "g");
        }
        System.out.println();
    }
}

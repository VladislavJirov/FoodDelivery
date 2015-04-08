package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Dish;
import com.thedeanda.lorem.Lorem;

import java.util.Random;

public class DishFactory {

    private static final Random RANDOM = new Random();

    public static Dish getRandomDish(){
         Dish dish = new Dish(Lorem.getWords(1,2),RANDOM.nextInt(100));
        for (int i = 0; i < 5; i++) {
            dish.setIngredients(IngredientFactory.getRandomIngredient(), RANDOM.nextInt(100));
        }
        return dish;
    }
}

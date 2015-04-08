package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Ingredient;
import com.thedeanda.lorem.Lorem;

import java.util.Random;

public class IngredientFactory {

    private static final Random RANDOM = new Random();

    public static Ingredient getRandomIngredient(){
        Ingredient ingredient = new Ingredient(Lorem.getWords(1), RANDOM.nextInt(100));
        ingredient.setCalories(RANDOM.nextInt(1000));
        return ingredient;}
}



package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Dish;
import com.thedeanda.lorem.Lorem;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import java.util.Random;

public class DishFactory {

    private static final Random RANDOM = new Random();

    public static Dish getRandomDish(){
        Dish dish = new Dish(Lorem.getWords(1), Money.of(CurrencyUnit.AUD,RANDOM.nextInt(50)));
        for (int i = 0; i < 5; i++) {
            dish.setIngredients(IngredientFactory.getRandomIngredient(), RANDOM.nextInt(100));
        }
        dish.setAvailable(true);
        dish.setCalories(RANDOM.nextInt(200));
        dish.setDescription(Lorem.getWords(7));
        return dish;
    }
}

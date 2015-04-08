package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Menu;

import java.util.Random;

public class MenuFactory {
    private static final Random RANDOM = new Random();

    public static Menu getRandomMenu(){
        Menu menu = new Menu("Main menu");
        for (int i = 0; i < RANDOM.nextInt(20); i++) {
            menu.setDishes(DishFactory.getRandomDish());
        }
        return menu;
    }
}

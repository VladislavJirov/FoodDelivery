package com.epam.vzhirov.fooddelivery.model.factory;

import com.epam.vzhirov.fooddelivery.model.Order;

import java.util.Random;

public class OrderFactory {

    private static final Random RANDOM = new Random();

    public static Order getRandomOrder(){
        Order order = new Order();
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            order.setDishes(DishFactory.getRandomDish(),RANDOM.nextInt(10));
        }
        return order;
    }

}

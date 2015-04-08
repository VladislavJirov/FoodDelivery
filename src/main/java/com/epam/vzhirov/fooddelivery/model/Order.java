package com.epam.vzhirov.fooddelivery.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private Map<Dish, Integer> dishes = new HashMap<Dish, Integer>();
    private Integer rawPrice;
    private List<Discount> discounts = new ArrayList<Discount>(); // init. not required
    private Integer totalPrice;

    public Order() {
        this.rawPrice = 0;
    }

    public Map<Dish, Integer> getDishes() {
        return dishes;
    }

    public void setDishes(Dish dish, Integer amount) {
        dishes.put(dish, amount);
        this.rawPrice += dish.getPrice();
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public Integer getRawPrice() {
        return rawPrice;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
}

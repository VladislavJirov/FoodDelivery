package com.epam.vzhirov.fooddelivery.model;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.*;

public class Order {

    private Map<Dish, Integer> dishes = new HashMap<>();
    private Money rawPrice;
    private List<Discount> discounts = new ArrayList<>(); // init. not required
    private Integer totalPrice;

    public Order() {
        this.rawPrice = Money.zero(CurrencyUnit.of(Locale.getDefault()));
    }

    public Map<Dish, Integer> getDishes() {
        return dishes;
    }

    public void setDishes(Dish dish, Integer amount) {
        dishes.put(dish, amount);
        this.rawPrice = Money.total(rawPrice, dish.getPrice());
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public Money getRawPrice() {
        return rawPrice;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
}

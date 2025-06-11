package org.example.pizza_factory.cityStores;

import org.example.pizza_factory.Pizza;
import org.example.pizza_factory.PizzaStore;
import org.example.pizza_factory.cityStylesPizzas.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("“cheese”")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}

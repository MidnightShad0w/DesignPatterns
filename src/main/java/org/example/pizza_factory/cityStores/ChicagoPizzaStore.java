package org.example.pizza_factory.cityStores;

import org.example.pizza_factory.Pizza;
import org.example.pizza_factory.PizzaStore;
import org.example.pizza_factory.cityStylesPizzas.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("“cheese”")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}

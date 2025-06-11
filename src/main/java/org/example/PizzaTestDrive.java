package org.example;

import org.example.pizza_factory.Pizza;
import org.example.pizza_factory.PizzaStore;
import org.example.pizza_factory.cityStores.ChicagoPizzaStore;
import org.example.pizza_factory.cityStores.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("“cheese”");
        System.out.println("“Ethan ordered a “" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("“cheese”");
        System.out.println("“Joel ordered a “" + pizza.getName() + "\n");
    }
}

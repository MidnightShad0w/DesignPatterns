package org.example.ducks_strategy;

import org.example.ducks_strategy.UtilClasses.FlyNoWay;
import org.example.ducks_strategy.UtilClasses.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("“I’m a model duck”");
    }
}

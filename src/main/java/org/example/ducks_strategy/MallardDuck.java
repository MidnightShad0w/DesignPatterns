package org.example.ducks_strategy;

import org.example.ducks_strategy.UtilClasses.FlyWithWings;
import org.example.ducks_strategy.UtilClasses.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}

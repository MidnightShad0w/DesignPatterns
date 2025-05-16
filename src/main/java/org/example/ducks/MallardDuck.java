package org.example.ducks;

import org.example.ducks.UtilClasses.FlyWithWings;
import org.example.ducks.UtilClasses.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}

package org.example.ducks;

import org.example.ducks.UtilClasses.FlyNoWay;
import org.example.ducks.UtilClasses.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("“I’m a model duck”");
    }
}

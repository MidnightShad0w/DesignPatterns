package org.example.ducks_strategy.UtilClasses;

import org.example.ducks_strategy.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}

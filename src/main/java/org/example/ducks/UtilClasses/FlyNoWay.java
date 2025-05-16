package org.example.ducks.UtilClasses;

import org.example.ducks.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can’t fly");
    }
}

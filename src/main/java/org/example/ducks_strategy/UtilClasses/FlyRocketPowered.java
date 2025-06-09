package org.example.ducks_strategy.UtilClasses;

import org.example.ducks_strategy.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("“I’m flying with a rocket!”");
    }
}

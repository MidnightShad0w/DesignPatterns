package org.example.ducks.UtilClasses;

import org.example.ducks.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("“I’m flying with a rocket!”");
    }
}

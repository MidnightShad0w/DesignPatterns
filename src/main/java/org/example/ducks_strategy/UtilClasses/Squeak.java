package org.example.ducks_strategy.UtilClasses;

import org.example.ducks_strategy.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squuuueeeeaaaak!!");
    }
}

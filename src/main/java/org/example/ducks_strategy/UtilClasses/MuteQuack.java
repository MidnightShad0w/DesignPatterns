package org.example.ducks_strategy.UtilClasses;

import org.example.ducks_strategy.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

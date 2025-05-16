package org.example.ducks.UtilClasses;

import org.example.ducks.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

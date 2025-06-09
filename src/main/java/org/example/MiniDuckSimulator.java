package org.example;

import org.example.ducks_strategy.Duck;
import org.example.ducks_strategy.MallardDuck;
import org.example.ducks_strategy.ModelDuck;
import org.example.ducks_strategy.UtilClasses.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("------------------------------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

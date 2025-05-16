package org.example;

import org.example.ducks.Duck;
import org.example.ducks.MallardDuck;
import org.example.ducks.ModelDuck;
import org.example.ducks.UtilClasses.FlyRocketPowered;

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

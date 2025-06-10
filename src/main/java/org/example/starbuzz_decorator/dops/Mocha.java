package org.example.starbuzz_decorator.dops;

import org.example.starbuzz_decorator.Beverage;
import org.example.starbuzz_decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {

        return .20 + beverage.cost();
    }
}

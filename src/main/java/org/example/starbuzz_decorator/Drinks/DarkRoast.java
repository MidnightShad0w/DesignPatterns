package org.example.starbuzz_decorator.Drinks;

import org.example.starbuzz_decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}

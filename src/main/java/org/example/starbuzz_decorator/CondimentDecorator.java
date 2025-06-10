package org.example.starbuzz_decorator;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

package org.example.starbuzz_decorator;

public abstract class Beverage {
    public String description = "UNK beverage";
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

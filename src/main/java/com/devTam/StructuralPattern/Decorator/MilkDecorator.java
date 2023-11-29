package com.devTam.StructuralPattern.Decorator;
// Concrete Decorator: MilkDecorator
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}

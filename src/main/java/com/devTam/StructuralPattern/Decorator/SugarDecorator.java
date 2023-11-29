package com.devTam.StructuralPattern.Decorator;

// Concrete Decorator: SugarDecorator
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getDescription() {
        return super.getDescription() + ", with sugar";
    }
}

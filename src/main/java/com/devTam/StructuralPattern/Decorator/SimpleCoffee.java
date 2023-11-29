package com.devTam.StructuralPattern.Decorator;


// Concrete Component: SimpleCoffee
public class SimpleCoffee implements Coffee {
    public double getCost() {
        return 1.0;
    }

    public String getDescription() {
        return "Simple coffee";
    }
}
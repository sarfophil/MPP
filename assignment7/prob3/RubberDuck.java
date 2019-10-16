package com.mpp.lesson7.prob3;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Displaying");
    }

    @Override
    public void fly() {
        System.out.println("Squeaking");
    }

    @Override
    public void quack() {
        System.out.println("Cannot Fly");
    }
}

package com.mpp.lesson7.prob3;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Displaying");
    }

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }
}

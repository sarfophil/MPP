package com.mpp.lesson7.prob3;

public interface Flyable {
    default void fly(){
        System.out.println("Fly with wings");
    }
}

package com.mpp.lesson8.assignment8.day2;

import java.util.function.Supplier;

public class prob2II {
    public static void main(String[] args) {
        Supplier<Double> number = ()->{
          return Math.random();
        };

        System.out.println(number.get());
    }
}

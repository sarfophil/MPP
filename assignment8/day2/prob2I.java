package com.mpp.lesson8.assignment8.day2;

import java.util.function.Supplier;

public class prob2I {
    public static void main(String[] args) {
        Supplier<Double> number = Math::random;
        //Random generated numbers
        System.out.println(number.get());
    }
}

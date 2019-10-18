package com.mpp.lesson8.assignment8;

import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

        //a
        fruits.forEach(fruit->{
            System.out.println(fruit);
        });

        //b
        fruits.forEach(System.out::println);
    }
}

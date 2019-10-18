package com.mpp.lesson8.assignment8.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author SARFO PHILIP
 */
public class prob1 {
    public static void main(String[] args){
        BiFunction<Double,Double,List<Double>> listBiFunction = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };
        listBiFunction.apply(2.0,3.0);

    }
}

package com.mpp.lesson8.assignment8.day2;

import java.util.Arrays;

/**
 * @author SARFO PHILIP
 */
public class prob4 {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names,String::compareToIgnoreCase);
    }
}

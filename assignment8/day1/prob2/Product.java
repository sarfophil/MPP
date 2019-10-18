package com.mpp.lesson8.assignment8.day1.prob2;

/**
 * @author SARFO PHILIP
 */
public class Product {
    private final String title;
    private final double price;
    private final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("\n %s:%s:%s",title,price,model);
    }
}

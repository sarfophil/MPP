package com.mpp.lesson8.assignment8.day1.prob2;

import java.util.*;

/**
 * @author SARFO PHILIP
 */
public class Main {
     public static void main(String[] args) {
         List<Product> productList = new ArrayList<>(
                 Arrays.asList(new Product("Wallet",4.0,9),
                               new Product("Shoe",3.4,9),
                               new Product("Shirt",4.5,2))
         );

        //a:
         Collections.sort(productList,new PriceComparator());
         System.out.println(productList);

         //b.
         Collections.sort(productList,new TitleComparator());
         System.out.println(productList);

         //c.
         Collections.sort(productList, new Comparator<Product>() {
             @Override
             public int compare(Product o1, Product o2) {
                 return o1.getTitle().compareToIgnoreCase(o2.getTitle());
             }
         });

         //d.
         Collections.sort(productList,(p1,p2)->{
             if(p1.getTitle().equals(p2.getTitle()))
                 return ((Integer) p1.getModel()).compareTo(((Integer) p2.getModel()));
             return p1.getTitle().compareToIgnoreCase(p2.getTitle());
         });
    }
}

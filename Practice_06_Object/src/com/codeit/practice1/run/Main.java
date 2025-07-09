package com.codeit.practice1.run;

import com.codeit.practice1.model.Product;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.setBrand("Apple");
        p.setPName("MacBook Pro");
        p.setPrice(2390000);

        System.out.println(p);
    }
}

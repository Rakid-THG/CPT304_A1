// CoconutJelly.java
package com.silver.milktea.products.topping;

public class CoconutJelly implements Topping {
    @Override
    public void add() {
        System.out.println("Adding tropical coconut jelly");
    }

    @Override
    public double getCost() {
        return 0.7;
    }
}
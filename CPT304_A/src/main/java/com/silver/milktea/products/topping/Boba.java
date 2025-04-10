// Boba.java
package com.silver.milktea.products.topping;

public class Boba implements Topping {
    @Override
    public void add() {
        System.out.println("Adding big big boba");
    }

    @Override
    public double getCost() {
        return 0.4;
    }
}
// TaroBall.java
package com.silver.milktea.products.topping;

public class TaroBall implements Topping {
    @Override
    public void add() {
        System.out.println("Adding yummy taro balls");
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}
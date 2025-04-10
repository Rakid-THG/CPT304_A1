// MilkGreenTea.java
package com.silver.milktea.products.base;

public class MilkGreenTea implements TeaBase {
    @Override
    public void prepare() {
        System.out.println("Brewing premium milk green tea base");
    }

    @Override
    public String getDescription() {
        return "Milk Green Tea";
    }
}
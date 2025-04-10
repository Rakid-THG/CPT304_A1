// BlackTea.java
package com.silver.milktea.products.base;

public class BlackTea implements TeaBase {
    @Override
    public void prepare() {
        System.out.println("Brewing premium black tea base");
    }

    @Override
    public String getDescription() {
        return "Black Tea";
    }
}

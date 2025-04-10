// LargeCup.java
package com.silver.milktea.products.packaging;

public class LargeCup implements Packaging {
    @Override
    public void selectSize() {
        System.out.println("Selected 15oz extra large cup");
    }

    @Override
    public String getSize() {
        return "Large (15oz)";
    }
}
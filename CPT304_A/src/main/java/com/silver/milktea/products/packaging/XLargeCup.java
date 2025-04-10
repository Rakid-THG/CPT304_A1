// XLargeCup.java
package com.silver.milktea.products.packaging;

public class XLargeCup implements Packaging {
    @Override
    public void selectSize() {
        System.out.println("Selected 20oz extra large cup");
    }

    @Override
    public String getSize() {
        return "X-Large (20oz)";
    }
}
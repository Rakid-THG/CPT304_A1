// MediumCup.java
package com.silver.milktea.products.packaging;

public class MediumCup implements Packaging {
    @Override
    public void selectSize() {
        System.out.println("Selected 10oz little cup");
    }

    @Override
    public String getSize() {
        return "Medium (10oz)";
    }
}
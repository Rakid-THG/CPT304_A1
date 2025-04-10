// FruitJuice.java
package com.silver.milktea.products.base;

public class FruitJuice implements TeaBase {
    private final String fruitType;

    public FruitJuice(String fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public void prepare() {
        System.out.println("Brewing premium fruit juice base");
    }

    @Override
    public String getDescription() {
        return "Fruit Juice";
    }
}

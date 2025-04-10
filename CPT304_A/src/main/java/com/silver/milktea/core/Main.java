package com.silver.milktea.core;

import com.silver.milktea.factories.*;

public class Main {
    public static void main(String[] args) {
        prepareOrder(new ClassicSeriesFactory());
        prepareOrder(new PremiumSeriesFactory());
        prepareOrder(new TropicalSeriesFactory());
    }

    private static void prepareOrder(MilkTeaFactory factory) {
        factory.displayCombo();

        var base = factory.createTeaBase();
        var topping = factory.createSignatureTopping();
        var packaging = factory.createPackaging();

        System.out.println("\nMaking your drink:");
        base.prepare();
        topping.add();
        packaging.selectSize();
        System.out.println("----------------------");
    }
}
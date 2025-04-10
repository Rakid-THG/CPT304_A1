package com.silver.milktea.factories;

import com.silver.milktea.products.base.FruitJuice;
import com.silver.milktea.products.base.TeaBase;
import com.silver.milktea.products.packaging.Packaging;
import com.silver.milktea.products.topping.CoconutJelly;
import com.silver.milktea.products.packaging.XLargeCup;
import com.silver.milktea.products.topping.Topping;

public class TropicalSeriesFactory implements MilkTeaFactory {

    @Override
    public TeaBase createTeaBase() {
        return new FruitJuice("Mango-Passionfruit");
    }

    @Override
    public Topping createSignatureTopping() {
        return new CoconutJelly();
    }

    @Override
    public Packaging createPackaging() {
        return new XLargeCup();
    }

    @Override
    public void displayCombo() {
        System.out.println("\n\u001B[36m=== Tropical Series ===\u001B[0m"); // 青色标题
        MilkTeaFactory.super.displayCombo();
        System.out.println("(Comes with summer-themed cup sleeve)");
    }
}
package com.silver.milktea.factories;

import com.silver.milktea.products.base.BlackTea;
import com.silver.milktea.products.base.TeaBase;
import com.silver.milktea.products.packaging.Packaging;
import com.silver.milktea.products.topping.Boba;
import com.silver.milktea.products.packaging.MediumCup;
import com.silver.milktea.products.topping.Topping;

public class ClassicSeriesFactory implements MilkTeaFactory {

    @Override
    public TeaBase createTeaBase() {
        return new BlackTea();
    }

    @Override
    public Topping createSignatureTopping() {
        return new Boba();
    }

    @Override
    public Packaging createPackaging() {
        return new MediumCup();
    }

    // 可选：覆盖默认展示逻辑
    @Override
    public void displayCombo() {
        System.out.println("\n=== Classic Series ===");
        MilkTeaFactory.super.displayCombo();
        System.out.println("(Best seller since 1999)");
    }
}
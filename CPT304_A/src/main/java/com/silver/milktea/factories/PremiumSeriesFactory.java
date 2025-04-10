package com.silver.milktea.factories;

import com.silver.milktea.products.base.MilkGreenTea;
import com.silver.milktea.products.base.TeaBase;
import com.silver.milktea.products.packaging.Packaging;
import com.silver.milktea.products.topping.TaroBall;
import com.silver.milktea.products.packaging.LargeCup;
import com.silver.milktea.products.topping.Topping;

public class PremiumSeriesFactory implements MilkTeaFactory {

    @Override
    public TeaBase createTeaBase() {
        return new MilkGreenTea();
    }

    @Override
    public Topping createSignatureTopping() {
        return new TaroBall();
    }

    @Override
    public Packaging createPackaging() {
        return new LargeCup();
    }

    @Override
    public void displayCombo() {
        System.out.println("\n\u001B[35m=== Premium Series ===\u001B[0m"); // 紫色标题
        MilkTeaFactory.super.displayCombo();
        System.out.println("(Includes VIP member points x2)");
    }
}
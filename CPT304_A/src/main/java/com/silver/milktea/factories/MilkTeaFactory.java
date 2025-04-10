package com.silver.milktea.factories;

import com.silver.milktea.products.base.TeaBase;
import com.silver.milktea.products.topping.Topping;
import com.silver.milktea.products.packaging.Packaging;

public interface MilkTeaFactory {
    TeaBase createTeaBase();
    Topping createSignatureTopping();
    Packaging createPackaging();

    default void displayCombo() {
        System.out.println("\n=== Special Combo ===");
        System.out.println("Base: \u001B[33m" + createTeaBase().getDescription() + "\u001B[0m");
        System.out.println("Topping: +\u001B[32m$" + String.format("%.2f", createSignatureTopping().getCost()) + "\u001B[0m");
        System.out.println("Size: \u001B[34m" + createPackaging().getSize() + "\u001B[0m");
    }
}
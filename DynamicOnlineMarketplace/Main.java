package com.day_01.DynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {

        // Create product object
        Product<OnlineMarketplace.Category> book = new Product<>("Java", 299, OnlineMarketplace.Category.Books);
        Product<OnlineMarketplace.Category> shirt = new Product<>("T-shirt", 200, OnlineMarketplace.Category.Clothing);
        Product<OnlineMarketplace.Category> headphone = new Product<>("Headphone", 199, OnlineMarketplace.Category.Gadgets);

        // Display products before discount
        System.out.println("Before discount:");
        System.out.println(book.display());
        System.out.println(shirt.display());
        System.out.println(headphone.display());
        System.out.println(" ");

        // Apply discounts
        OnlineMarketplace.applyDiscount(book, 10);
        OnlineMarketplace.applyDiscount(shirt, 15);
        OnlineMarketplace.applyDiscount(headphone, 18);

        System.out.println(" ");

        // Display products after discount
        System.out.println("After discount:");
        System.out.println(book.display());
        System.out.println(shirt.display());
        System.out.println(headphone.display());
    }
}


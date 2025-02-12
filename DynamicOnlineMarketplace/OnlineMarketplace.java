package com.day_01.DynamicOnlineMarketplace;

public class OnlineMarketplace {

    //creating the enums to store the category
    public enum Category {
        Books, Clothing, Gadgets;
    }

    // Generic method to apply discount
    public static <T> void applyDiscount(com.day_01.DynamicOnlineMarketplace.Product<T> product, double percentage) {
        double currentPrice = product.getPrice();
        double discountAmount = currentPrice * (percentage / 100);
        double newPrice = currentPrice - discountAmount;
        product.setPrice(newPrice);
        System.out.println("The discount applied: " + percentage + "% and the updated price of the " + product.getName() + " is: " + newPrice);
    }

}
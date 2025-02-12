package com.day_01.DynamicOnlineMarketplace;


public class Product<T> {
    private T category;
    private String name;
    private double price;

    // Constructor to initialize product
    public Product(String name, double price, T category) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    // Getter and Setter methods
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public String display() {
        return "Product name: " + name + " , price is: " + price + " , category: " + category;
    }
}
package com.day_01.WarehouseManagementSystem;

// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;
    private double price;

    // constructing a constructor to initialise the items
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Item: " + name + ", Price: " + price;
    }

}
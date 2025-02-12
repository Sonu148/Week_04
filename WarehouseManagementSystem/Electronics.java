package com.day_01.WarehouseManagementSystem;

// Class representing electronics items
public class Electronics extends WarehouseItem {
    private String brand;

    // constructor with adding new parameter brand
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand;
    }
}
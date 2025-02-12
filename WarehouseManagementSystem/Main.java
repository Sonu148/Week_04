package com.day_01.WarehouseManagementSystem;

import java.util.List;

public class Main {
         // Method to display items
        public static void displayItems(List<? extends WarehouseItem> items) {
            for (WarehouseItem item : items) {
                System.out.println(item);
            }
        }

    // Main method to manage the warehouse
    public static void main(String[] args) {

        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage
        electronicsStorage.addItem(new Electronics("Smartphone", 20000, "Realme"));

        groceriesStorage.addItem(new Groceries("Milk", 33, "2023-12-01"));

        furnitureStorage.addItem(new Furniture("Table", 2000, "Wood"));

        // Display all items
        System.out.println("Electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("Groceries:");
        displayItems(groceriesStorage.getItems());

        System.out.println("Furniture:");
        displayItems(furnitureStorage.getItems());
    }
}


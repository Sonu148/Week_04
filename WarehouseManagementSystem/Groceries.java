package com.day_01.WarehouseManagementSystem;
// Class representing grocery items
  class Groceries extends WarehouseItem {
    private String expirationDate;

    // constructor with adding new parameter brand
    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
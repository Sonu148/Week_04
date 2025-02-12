package com.day_01.WarehouseManagementSystem;
// Class representing furniture items
 class Furniture extends WarehouseItem {
    private String material;

    // constructor with adding new parameter brand
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
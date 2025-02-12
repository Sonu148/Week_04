package com.day_01.WarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Generic class for storing warehouse items
  class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // adding the item in  the list
    public void addItem(T item) {
        items.add(item);
    }

    // method for getting the items
    public List<T> getItems() {
        return items;
    }
}
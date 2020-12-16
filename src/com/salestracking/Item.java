package com.salestracking;

import java.util.HashMap;
import java.util.List;

public class Item {
    private static int id;
    private String name;
    private String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String catrgory) {
        this.category = catrgory;
    }

    public static void setId(int id) {
        Item.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

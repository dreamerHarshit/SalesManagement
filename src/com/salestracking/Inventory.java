package com.salestracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private HashMap<String, Integer> itemQty;
    private List<Item> items;
    private HashMap<String, String> itemCategory;
    public Inventory() {
        this.items = new ArrayList<>();
        this.itemCategory = new HashMap<>();
        this.itemQty = new HashMap<>();
    }
    public void addItem(String name, String category, int qty){
        if(itemQty.containsKey(name)){
            itemQty.put(name, itemQty.get(name)+qty);
        }
        else{
            itemQty.put(name,qty);
        }
        if(itemCategory.containsKey(name)){
            itemQty.put(name, itemQty.get(name)+qty);
        }
        else{
            itemQty.put(name,qty);
        }
        Item item = new Item(name, category);
        itemCategory.put(name, category);
    }

    public void getItem(String name, int qty){
        if(itemQty.containsKey(name) && itemQty.get(name)>=qty){
            itemQty.put(name, itemQty.get(name)-qty);
        }
    }

    public void getStockDetails(){
        for(Map.Entry<String, Integer> entry:itemQty.entrySet()){
            System.out.println("Item: "+entry.getKey()+"Qty: "+entry.getValue());
        }
    }

    public String getItemCategory(String name) {
        return itemCategory.get(name);
    }
}

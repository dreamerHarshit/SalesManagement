package com.salestracking;

import java.util.HashMap;

public class Store {
    private static int ID=0;
    private int id;
    private String city;
    private String country;
    private String state;
    private Inventory inventory;
    private int snack = 0;
    private int beaverage = 0;
    private Sale sale;
    public Store(String city,String country,String state){
        this.id = ID++;
        this.city = city;
        this.state = state;
        this.country = country;
        this.inventory = new Inventory();
        this.sale = new Sale();
    }

    public void addInventory(String item, String category, int qty){
        if(category.toLowerCase().equals("snack"))
            snack++;
        if(category.toLowerCase().equals("beaverage"))
            beaverage++;
        inventory.addItem(item.toLowerCase(), category.toLowerCase(), qty);
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getStockDetails(){
        inventory.getStockDetails();
    }

    public void getItem(String name, int qty){
        inventory.getItem(name, qty);
        String cat = inventory.getItemCategory(name);
        sale.updateSale(name, cat);
    }

    public int getSnack() {
        return snack;
    }

    public int getBeaverage() {
        return beaverage;
    }


    public void getDailySale(){
        SalesReporting.getDailySale(sale);
    }

    public int getMonthlyBeaverageSale(){
        return SalesReporting.getMonthlyBeaverageSale(sale);
    }

    public int getMonthlyCoffeeSale(){
        return SalesReporting.getMonthlyCoffeeSale(sale);
    }

}

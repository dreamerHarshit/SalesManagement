package com.salestracking;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        company.addStore("Bangalore", "India","Karnataka");
        company.addStore("Noida", "India","UP");
        company.addStore("Delhi", "India","Delhi");
        List<Store> stores = company.getStoresList();
        Store currStore = stores.get(0);
        currStore.addInventory("Burger", "Snack", 5);
        currStore.addInventory("Sandwich", "Snack", 5);
        currStore.addInventory("Coffee", "beaverage", 20);
        currStore.getItem("coffee",1);
        System.out.println("---Stock details of current store---");
        currStore.getStockDetails();
        System.out.println("---Cities with Shortage of snacks---");
        company.getStoreSnackShortage();
        System.out.println("----State with highes Beaverage consumption---");
        company.highestBeaverageConsumeState();
        System.out.println("---City wise coffee sale---");
        company.citiesMonthlyCoffeeSale();
        System.out.println("---State wise coffee sale---");
        company.statesMonthlyCoffeeSale();

    }
}

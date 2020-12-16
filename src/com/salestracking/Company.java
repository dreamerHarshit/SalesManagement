package com.salestracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    HashMap<String, List<String>> stateCountry;
    HashMap<String, List<String>> cityState;
    HashMap<String, List<Store>> cityStore;
    HashMap<Integer, Store> stores;
    List<Store> storesList;
    int shortage = 2;

    public Company() {
        stateCountry = new HashMap<>();
        cityStore = new HashMap<>();
        cityState = new HashMap<>();
        stores = new HashMap<>();
        storesList = new ArrayList<>();

    }

    public void addStore(String city, String country, String state){
        Store store = new Store(city, country, state);
        stores.put(store.getId(), store);
        setCityStore(city, store);
        storesList.add(store);
    }


    public void setCityStore(String city, Store store) {
       if(cityStore.containsKey(city)){
           cityStore.get(city).add(store);
       }
       else{
           ArrayList<Store> list = new ArrayList<>();
           list.add(store);
           cityStore.put(city, list);
       }
    }

    public void getStoreSnackShortage(){
        for(Store s: storesList){
            if(s.getSnack()<shortage)
                System.out.println(s.getCity());
        }
    }

    public void highestBeaverageConsumeState(){
        int highest = 0;
        Store store = null;
        for(Store s: storesList){
            if(s.getMonthlyBeaverageSale()>highest){
                highest=s.getBeaverage();
                store = s;
            }
        }
        if(store!=null)
            System.out.println(store.getState());
        else
            System.out.println("No store found!");
    }

    public void statesMonthlyCoffeeSale(){
        HashMap<String,Integer> map = new HashMap<>();
        for (Store s:storesList){
            if(map.containsKey(s.getState())){
                int val = map.get(s.getState())+s.getMonthlyCoffeeSale();
                map.put(s.getState(), val);
            }
            else{
                map.put(s.getState(),s.getMonthlyCoffeeSale());
            }
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }

    public void citiesMonthlyCoffeeSale(){
        HashMap<String,Integer> map = new HashMap<>();
        for (Store s:storesList){
            if(map.containsKey(s.getCity())){
                System.out.println("count="+s.getMonthlyCoffeeSale());
                int val = map.get(s.getCity())+s.getMonthlyCoffeeSale();
                map.put(s.getCity(), val);
            }
            else{
                System.out.println("count="+s.getMonthlyCoffeeSale());
                map.put(s.getCity(),s.getMonthlyCoffeeSale());
            }
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }

    public List<Store> getStoresList() {
        return storesList;
    }
}

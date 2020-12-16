package com.salestracking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class Sale {
    private HashMap<Month, HashMap<Integer, Integer>> monthlyCoffeeSale;
    private HashMap<Month, HashMap<Integer, Integer>> monthlyBeaverageSale;
    private HashMap<Month, HashMap<Integer, Integer>> monthlySnackSale;
    private HashMap<Month, HashMap<Integer, Integer>> monthlySale;

    public Sale() {
        monthlyCoffeeSale = new HashMap<>();
        monthlyBeaverageSale = new HashMap<>();
        monthlySnackSale = new HashMap<>();
        monthlySale = new HashMap<>();
    }

    public void updateSale(String name, String category){
        LocalDate currTime = LocalDate.now();
        Month currMonth = currTime.getMonth();
        int currDate = currTime.getDayOfMonth();
        if(monthlySale.containsKey(currMonth)){
            if(monthlySale.get(currMonth).containsKey(currDate)){
                int count = monthlySale.get(currMonth).get(currDate);
                count++;
                monthlySale.get(currMonth).put(currDate,count);
            }
            else{
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(currDate,1);
                monthlySale.put(currMonth, map);
            }

        }
        else{
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(currDate,1);
            monthlySale.put(currMonth, map);
        }
        if(category.equals("beaverage")){
            updateBeaverageSale();
        }
        if(name.equals("coffee")){
            updateCoffeeSale();
        }
    }
    private void updateBeaverageSale(){
        LocalDate currTime = LocalDate.now();
        Month currMonth = currTime.getMonth();
        int currDate = currTime.getDayOfMonth();
        if(monthlyBeaverageSale.containsKey(currMonth)){
            if(monthlyBeaverageSale.get(currMonth).containsKey(currDate)){
                int count = monthlyBeaverageSale.get(currMonth).get(currDate);
                count++;
                monthlyBeaverageSale.get(currMonth).put(currDate,count);
            }
            else{
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(currDate,1);
                monthlyBeaverageSale.put(currMonth, map);
            }

        }
        else{
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(currDate,1);
            monthlyBeaverageSale.put(currMonth, map);
        }
    }

    private void updateCoffeeSale(){
        LocalDate currTime = LocalDate.now();
        Month currMonth = currTime.getMonth();
        int currDate = currTime.getDayOfMonth();
        if(monthlyCoffeeSale.containsKey(currMonth)){
            if(monthlyCoffeeSale.get(currMonth).containsKey(currDate)){
                int count = monthlyCoffeeSale.get(currMonth).get(currDate);
                count++;
                monthlyCoffeeSale.get(currMonth).put(currDate,count);
            }
            else{
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(currDate,1);
                monthlyCoffeeSale.put(currMonth, map);
            }

        }
        else{
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(currDate,1);
            monthlyCoffeeSale.put(currMonth, map);
        }
    }

    public HashMap<Month, HashMap<Integer, Integer>> getMonthlyCoffeeSale() {
        return monthlyCoffeeSale;
    }

    public HashMap<Month, HashMap<Integer, Integer>> getMonthlyBeaverageSale() {
        return monthlyBeaverageSale;
    }

    public HashMap<Month, HashMap<Integer, Integer>> getMonthlySnackSale() {
        return monthlySnackSale;
    }

    public HashMap<Month, HashMap<Integer, Integer>> getMonthlySale() {
        return monthlySale;
    }
}

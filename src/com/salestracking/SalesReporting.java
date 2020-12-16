package com.salestracking;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SalesReporting {

    public static void getDailySale(Sale sale){
        LocalDate date = LocalDate.now();
        HashMap<Month, HashMap<Integer, Integer>> map = sale.getMonthlySale();
        HashMap<Integer, Integer> sales = map.get(date.getMonth());
        System.out.println(sales.get(date.getDayOfMonth()));
    }

    public static int getMonthlyBeaverageSale(Sale sale){
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        int totalSale = 0;
        HashMap<Month, HashMap<Integer, Integer>> map = sale.getMonthlyBeaverageSale();
        HashMap<Integer, Integer> sales = map.get(month);
        if(sales!=null){
            for(Map.Entry<Integer,Integer> m: sales.entrySet()){
                totalSale+=m.getValue();
            }
        }

        //System.out.println("Monthly Beaverage sale is:"+total_sale);
        return totalSale;
    }

    public static int getMonthlyCoffeeSale(Sale sale){
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        int totalSale = 0;
        HashMap<Month, HashMap<Integer, Integer>> map = sale.getMonthlyCoffeeSale();
        HashMap<Integer, Integer> sales = map.get(month);
        if(sales!=null){
            for(Map.Entry<Integer,Integer> m: sales.entrySet()){
                System.out.println("total sale ="+totalSale);
                totalSale+=m.getValue();
            }
        }

        return totalSale;
    }

}

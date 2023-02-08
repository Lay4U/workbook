package com.example.workbook.ch4;

public class P80_ImplicitTypeCastingAndCodeMaintainability {
    public static int fetchBestPrice(String[] products){
        float realprice = 399.99F;
        int price = (int) realprice;
        return price;
    }

    public static boolean debitCard(int amount){
        return true;
    }

    public static boolean purchaseCart(long customerId){
        int price = fetchBestPrice(new String[0]);
        boolean paid = debitCard(price);
        return paid;
    }

    public static float fetchBestPrice2(String[] products){
        float realprice = 399.99F;
        return realprice;
    }

    public static boolean debitCard2(float amount){
        return true;
    }

    public static boolean purchaseCart2(long customerId){
        var price = fetchBestPrice2(new String[0]);
        var paid = debitCard2(price);
        return paid;
    }


}

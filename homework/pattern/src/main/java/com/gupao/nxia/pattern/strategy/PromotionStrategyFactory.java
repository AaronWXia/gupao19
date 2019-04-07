package com.gupao.nxia.pattern.strategy;


import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String,Promotion> promotionMap = new HashMap<>();
    public static  final String CASH_KEY = "cash";

    static {
        promotionMap.put("cash",new CashPromotionStrategy());
        promotionMap.put("coupon",new CouponPromotionStrategy());
    }


    public static Promotion getPromotion(String key){
         return promotionMap.get(key);
    }

}

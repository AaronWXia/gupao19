package com.gupao.nxia.pattern.strategy;

public class Test {

    public static void main(String[] args) {
        Promotion promotion = PromotionStrategyFactory.getPromotion(PromotionStrategyFactory.CASH_KEY);
        promotion.discount();
    }
}

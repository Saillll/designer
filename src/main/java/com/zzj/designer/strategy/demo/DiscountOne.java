package com.zzj.designer.strategy.demo;

/**
 * 正常收费
 */
public class DiscountOne implements PriceCompute {
    @Override
    public double compute(double originprice) {
        return originprice;
    }
}

package com.zzj.designer.strategy.demo;

/**
 * 打折
 */
public class DiscountTwo implements PriceCompute {

    private int percentoff=8;//打n折

    public DiscountTwo(int percentoff) {
        this.percentoff = percentoff;
    }

    public DiscountTwo() {
    }

    @Override
    public double compute(double originprice) {
        return originprice*percentoff/10;
    }
}

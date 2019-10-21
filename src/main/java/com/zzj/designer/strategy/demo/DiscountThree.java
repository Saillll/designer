package com.zzj.designer.strategy.demo;

/**
 * 满减
 */
public class DiscountThree implements PriceCompute {

    private int costline=400;//满400

    private int cutoff = 100;//减100

    public DiscountThree(int costline, int cutoff) {
        this.costline = costline;
        this.cutoff = cutoff;
    }

    public DiscountThree() {
    }

    @Override
    public double compute(double originprice) {
        double price = originprice;
        if(originprice > costline){
            price = originprice - cutoff;
        }
        return price;
    }
}

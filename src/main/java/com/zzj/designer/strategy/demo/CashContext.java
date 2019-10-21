package com.zzj.designer.strategy.demo;

public class CashContext {

    private PriceCompute priceCompute;

    public CashContext(PriceCompute priceCompute) {
        this.priceCompute = priceCompute;
    }

    public CashContext() {
    }

    public void setPriceCompute(PriceCompute priceCompute) {
        this.priceCompute = priceCompute;
    }

    public double compute(double originprice){
        originprice = priceCompute.compute(originprice);
        System.out.println("The cutoff Price is " + originprice);
        return originprice;
    }
}

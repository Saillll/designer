package com.zzj.designer.strategy.demo;

public class ZZZTest {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext();
        double originprice = 600;
        PriceCompute computer;
        //原价
        computer = new DiscountOne();
        cashContext.setPriceCompute(computer);
        cashContext.compute(originprice);

        //打6折
        computer = new DiscountTwo(6);
        cashContext.setPriceCompute(computer);
        cashContext.compute(originprice);

        //满300减150
        computer = new DiscountThree(300,150);
        cashContext.setPriceCompute(computer);
        cashContext.compute(originprice);



    }
}

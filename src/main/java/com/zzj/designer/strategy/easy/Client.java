package com.zzj.designer.strategy.easy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        //每一个算法都封装成一个类
        context = new Context(new StrategyA());
        context.doSomething();

        context = new Context(new StrategyB());
        context.doSomething();

        context = new Context(new StrategyC());
        context.doSomething();
        //上面3种原始的方式和适配器模式

    }
}

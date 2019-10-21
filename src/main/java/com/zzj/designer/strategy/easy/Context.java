package com.zzj.designer.strategy.easy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public void doSomething(){
        strategy.doSomething();
    }
}

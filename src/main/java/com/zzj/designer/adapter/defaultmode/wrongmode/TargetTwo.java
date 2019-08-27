package com.zzj.designer.adapter.defaultmode.wrongmode;

public class TargetTwo {

    private Cases cases;

    public TargetTwo(Cases cases) {
        this.cases = cases;
    }

    public void doSomething() {
        cases.doSomething();
    }

    public void doThree() {
        cases.doThree();
    }
}

package com.zzj.designer.adapter.defaultmode.wrongmode;

public class TargetThree {

    private Cases cases;

    public TargetThree(Cases cases) {
        this.cases = cases;
    }

    public void doSomething() {
        cases.doSomething();
    }

    public void doOne() {
        cases.doOne();
    }

    public void doThree() {
        cases.doThree();
    }
}

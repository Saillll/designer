package com.zzj.designer.adapter.classmode;

public class ZZZTest {
    public static void main(String[] args) {
        Cases target = new Origin();
        target.doSomething();

        target = new Adapter();
        target.doSomething();
    }
}

package com.zzj.designer.adapter.classmode;

public class ZZZTest {
    public static void main(String[] args) {
        Cases target = new Origin();
        target.doSomething();
        System.out.println(target.hashCode());

        target = new Adapter();
        target.doSomething();
        System.out.println(target.hashCode());
        String opp = "asdasd";
        args.hashCode();
    }
}

package com.zzj.designer.proxy.dynamicmode;

public class Business implements IBusiness {
    @Override
    public void doWork() {
        System.out.println("Doing some work");
    }
}

package com.zzj.designer.proxy;

public class Singer implements SuperStar {
    @Override
    public void perform() {
        System.out.println("Singer performs");
    }
}

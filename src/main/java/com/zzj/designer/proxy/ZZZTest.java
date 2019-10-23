package com.zzj.designer.proxy;

public class ZZZTest {

    public static void main(String[] args) {
        Proxyer proxyer = new Proxyer(new Singer(),true);
        proxyer.perform();
        System.out.println("==============================");
        proxyer = new Proxyer(new Singer(),false);
        proxyer.perform();
    }
}

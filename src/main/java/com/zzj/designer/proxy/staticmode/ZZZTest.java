package com.zzj.designer.proxy.staticmode;

public class ZZZTest {

    public static void main(String[] args) {
        UserProxy userProxy = new UserProxy(new UserDao());
        userProxy.getUser();
    }
}

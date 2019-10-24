package com.zzj.designer.observer;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

public class RealObserver implements  Observer{

    private int name;

    public RealObserver(int name) {
        this.name = name;
    }

    @Override
    public void doUpdate() {
        System.out.println("【" + name + "】"+"  RealObserver doUpdate");
    }
}

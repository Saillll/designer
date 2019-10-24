package com.zzj.designer.observer;

public class RealSubject extends Subject {

    public void doSomething() {
        super.notifyAllObserver();
    }
}

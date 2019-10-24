package com.zzj.designer.observer;

public class ZZZTest {

    public static void main(String[] args) {
        //实例化一个主题
        RealSubject realSubject = new RealSubject();

        for (int i = 0; i < 10 ; i++) {
            //实例化多个观察者
            Observer observer = new RealObserver(i);
            //添加到主题当中
            realSubject.addObserver(observer);
        }
        //主题通知所有的观察者，然后观察者通过doUpdate做出反应
        realSubject.notifyAllObserver();
    }
}

package com.zzj.designer.observer;

import java.util.Vector;

public class Subject {

    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyAllObserver(){
        System.out.println("This is going to notify all observer to doUpdate");
        this.observers.stream().forEach(o -> {
            o.doUpdate();
        });
    }
}

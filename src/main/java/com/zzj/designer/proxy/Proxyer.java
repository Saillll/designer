package com.zzj.designer.proxy;

public class Proxyer implements SuperStar {

    private SuperStar superStar;

    private boolean busy;

    public Proxyer(SuperStar superStar,boolean busy) {
        this.superStar = superStar;
        this.busy = busy;
    }

    public Proxyer() {
    }

    @Override
    public void perform() {
        if(busy){
            System.out.println("Singer is busy,Performance cancel!");
            return;
        }
        this.superStar.perform();
    }
}

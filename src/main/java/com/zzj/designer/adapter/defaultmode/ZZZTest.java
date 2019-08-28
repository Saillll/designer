package com.zzj.designer.adapter.defaultmode;

public class ZZZTest {
    public static void main(String[] args) {

        Cases targetThree = new AdapterThree(new TargetThree());
        targetThree.doSomething();
        targetThree.doOne();
        targetThree.doThree();

        System.out.println("-----------");

        Cases targetTwo = new AdapterTwo(new TargetTwo());
        targetTwo.doSomething();
        targetTwo.doThree();

        System.out.println("-----------");

    }
}

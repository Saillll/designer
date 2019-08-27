package com.zzj.designer.adapter.objectmode;

public class ZZZTest {
    public static void main(String[] args) {
        Cases target = new Origin();
        target.doSomething();

        //默认构造器方法
        target = new Adapter();
        //使用传入的对象
        target = new Adapter(new Target());
        target.doSomething();
    }
}

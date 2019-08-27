package com.zzj.designer.adapter.classmode;

/**
 * 类适配器模式：在适配器的类上，实现接口的同时，继承目标类
 */
public class Adapter extends Target implements Cases{

    /**
     * 调用继承的父类的方法，实现接口功能的适配转换
     */
    @Override
    public void doSomething() {
        super.doSomethingFromTarget();
    }
}

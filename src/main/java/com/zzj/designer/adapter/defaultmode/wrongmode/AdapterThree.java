package com.zzj.designer.adapter.defaultmode.wrongmode;

/**
 * 错误的方法，因为此时并没有传入真正的目标类，把目标类的方法用于修改-实现doSomething/doOne/doThree的功能，而是直接写死了功能。
 * 这样就造成后期传来使用的{@link TargetThree}的对象，在{@link ZZZTest}使用TargetThree targetThree = new TargetThree(new AdapterThree())，使TargetThree没有可扩展性。
 * 这是一个错误的用法，此种使用 没有任何意义，不如直接写简单的继承类或者创建新的类 来实现需求。
 */
public class AdapterThree extends AdapterHolder {

    @Override
    public void doSomething() {
        System.out.println("This is AdapterThree.doSomething");
    }

    @Override
    public void doOne() {
        System.out.println("This is AdapterThree.doOne");
    }

    @Override
    public void doThree() {
        System.out.println("This is AdapterThree.doThree");
    }

}

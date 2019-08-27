package com.zzj.designer.adapter.objectmode;

/**
 * 对象适配器：在适配器的类上，实现接口，但是并不继承目标类，而是注入一个目标类的对象
 */
public class Adapter implements Cases {

    /**
     * 通过对象层次的关联关系进行委托（对象的合成关系/关联关系）
     * 此处可以直接初始化对象，也可以在构造方法中传入
     */
    private Target target = new Target();

    public Adapter(){}

    public Adapter(Target target) {
        this.target = target;
    }

    /**
     * 调用target对象的方法，实现接口功能的适配转换
     */
    @Override
    public void doSomething() {
        target.doSomethingFromTarget();
    }
}

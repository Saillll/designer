package com.zzj.designer.adapter.defaultmode;

/**
 * 在接口的功能太多时，某些不需要的功能可以省略，只实现需要的功能。
 * 本例子中,根据targetThree目标类的实际需要，只实现了AdapterHolder中的doSomething/doOne/doThree三个功能，剩下的一个doTwo不需要，所以未实现
 */
public class AdapterThree extends AdapterHolder {

    /**
     * 注入的实际使用的目标对象
     */
    private TargetThree targetThree;

    public AdapterThree(TargetThree targetThree) {
        this.targetThree = targetThree;
    }

    /**
     * 使用目标类targetThree的方法对原有的接口功能进行修改
     */
    @Override
    public void doSomething() {
        targetThree.doSomething();
    }

    /**
     * 使用目标类targetThree的方法对原有的接口功能进行修改
     */
    @Override
    public void doOne() {
        targetThree.doOne();
    }

    /**
     * 使用目标类targetThree的方法对原有的接口功能进行修改
     */
    @Override
    public void doThree() {
        targetThree.doThree();
    }

}

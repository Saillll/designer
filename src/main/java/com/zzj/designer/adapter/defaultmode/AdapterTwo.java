package com.zzj.designer.adapter.defaultmode;

/**
 * 在接口的功能太多时，某些不需要的功能可以省略，只实现需要的功能。
 * 本例子中,根据targetTwo目标类的实际需要，只实现了AdapterHolder中的doSomething/doThree三个功能，剩下的doOne/doTwo不需要，所以未实现
 */
public class AdapterTwo extends AdapterHolder {

    private TargetTwo targetTwo;

    public AdapterTwo(TargetTwo targetTwo) {
        this.targetTwo = targetTwo;
    }

    /**
     * 使用目标类targetTwo的方法对原有的接口功能进行修改
     */
    @Override
    public void doSomething() {
        targetTwo.doSomething();
    }

    /**
     * 使用目标类targetTwo的方法对原有的接口功能进行修改
     */
    @Override
    public void doThree() {
        targetTwo.doThree();
    }

}

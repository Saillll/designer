package com.zzj.designer.decorator;

public abstract class BaseHelper implements HelperEntry {

    private HelperEntry helper;

    private DotEntity dot;

    public BaseHelper(HelperEntry helper) {
        this.helper = helper;
    }

    public BaseHelper(HelperEntry helper, DotEntity dotEntity) {
        this.helper = helper;
        this.dot = dotEntity;
    }

    public DotEntity getDotEntity() {
        return dot;
    }

    /**
     * 做一些数据库链接的初始化设置
     */
    @Override
    public void doInit() {
        this.helper.doInit();
    }

    @Override
    public void doSave() {
        this.helper.doSave();
    }
}

package com.zzj.designer.decorator;

public interface HelperEntry {
    /**
     * 做一些数据库链接的初始化设置
     */
    void doInit();

    /**
     * 数据的保存操作
     */
    void doSave();
}

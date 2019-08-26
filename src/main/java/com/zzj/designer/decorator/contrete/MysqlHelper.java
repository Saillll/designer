package com.zzj.designer.decorator.contrete;

import com.zzj.designer.decorator.BaseHelper;
import com.zzj.designer.decorator.DotEntity;
import com.zzj.designer.decorator.HelperEntry;

public class MysqlHelper extends BaseHelper{

    public MysqlHelper(HelperEntry helper) {
        super(helper);
    }

    public MysqlHelper(HelperEntry helper, DotEntity dotEntity) {
        super(helper, dotEntity);
    }

    @Override
    public void doInit() {
        super.doInit();
        mysqlInit();
    }

    @Override
    public void doSave() {
        super.doSave();
        mysqlSave();
    }

    private void mysqlInit(){
        System.out.println("MysqlHelper.doInit");
    }

    private void mysqlSave(){
        System.out.println("MysqlHelper.doSave: " + this.getDotEntity().getId());
    }

}

package com.zzj.designer.decorator.contrete;

import com.zzj.designer.decorator.BaseHelper;
import com.zzj.designer.decorator.DotEntity;
import com.zzj.designer.decorator.HelperEntry;

public class MongoHelper extends BaseHelper{

    public MongoHelper(HelperEntry helper) {
        super(helper);
    }

    public MongoHelper(HelperEntry helper, DotEntity dotEntity) {
        super(helper, dotEntity);
    }

    @Override
    public void doInit() {
        super.doInit();
        mongoInit();
    }

    @Override
    public void doSave() {
        super.doSave();
        mongoSave();
    }

    private void mongoInit(){
        System.out.println("MongoHelper.doInit");
    }

    private void mongoSave(){
        System.out.println("MongoHelper.doSave: " + this.getDotEntity().getId());

    }


}

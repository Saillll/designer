package com.zzj.designer.decorator.contrete;

import com.zzj.designer.decorator.BaseHelper;
import com.zzj.designer.decorator.DotEntity;
import com.zzj.designer.decorator.HelperEntry;

public class RedisHelper extends BaseHelper{

    public RedisHelper(HelperEntry helper) {
        super(helper);
    }

    public RedisHelper(HelperEntry helper, DotEntity dotEntity) {
        super(helper, dotEntity);
    }

    @Override
    public void doInit() {
        super.doInit();
        redisInit();
    }

    @Override
    public void doSave() {
        super.doSave();
        redisSave();
    }

    private void redisInit(){
        System.out.println("RedisHelper.doInit");
    }

    private void redisSave(){
        System.out.println("RedisHelper.doSave: " + this.getDotEntity().getId());
    }


}

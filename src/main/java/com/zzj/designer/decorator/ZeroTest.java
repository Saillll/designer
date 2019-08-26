package com.zzj.designer.decorator;

import com.zzj.designer.decorator.contrete.MongoHelper;
import com.zzj.designer.decorator.contrete.MysqlHelper;
import com.zzj.designer.decorator.contrete.RedisHelper;

public class ZeroTest {
    public static void main(String[] args) {

        DotEntity dot = new DotEntity();
        dot.setId(666);
        dot.setLat("116.395645");
        dot.setLon("39.909622");

        //数据一次性入库mysql redis mongo
        //可以作为service组件，通过@Component和@Autowired注入到别处使用
        HelperEntry helper = new DBHelper("newDB",dot);
        helper = new MysqlHelper(helper,dot);
        helper = new RedisHelper(helper,dot);
        helper = new MongoHelper(helper,dot);

        helper.doInit();
        System.out.println("-----------------");
        helper.doSave();
    }
}

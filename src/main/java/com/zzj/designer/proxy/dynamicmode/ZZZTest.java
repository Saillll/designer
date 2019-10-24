package com.zzj.designer.proxy.dynamicmode;

import java.lang.reflect.Proxy;

public class ZZZTest {

    public static void main(String[] args) {
        IBusiness business = new Business();

        //动态代理，生成代理类对象，不需要定义一个代理类
        IBusiness proxy = (IBusiness) Proxy.newProxyInstance(business.getClass().getClassLoader(),business.getClass().getInterfaces(),new BusinessHandler(business));
        //参数loader指定动态代理类的类加载器，参数interfaces指定动态代理类需要实现的所有接口，参数handler指定与动态代理类相关联的InvocationHandler对象。
        // 所以我们只需调用newProxyInstance()方法就可以某一个对象的代理对象了。（有关ClassLoader类加载器的内容这里就不再赘述了，它的作用是将class文件加载到jvm虚拟机中去）。
        proxy.doWork();
    }
}

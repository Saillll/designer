package com.zzj.designer.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SearchInterceptor implements MethodInterceptor {

    /**
     *
     * @param o 表示增强的对象，即实现这个接口类的一个对象
     * @param method 表示要被拦截的方法；
     * @param objects 表示要被拦截方法的参数；
     * @param methodProxy 表示要触发父类的方法对象；
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("SearchInterceptor starts here");
        methodProxy.invokeSuper(o,objects);
        System.out.println("SearchInterceptor ends here");
        return null;
    }
}

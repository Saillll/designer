package com.zzj.designer.proxy.dynamicmode;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BusinessHandler implements InvocationHandler {

    private IBusiness business;

    public BusinessHandler(IBusiness business) {
        this.business = business;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Handler starts here");
        method.invoke(business,args);
        System.out.println("Handler ends here");
        return null;
    }
}

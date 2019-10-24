package com.zzj.designer.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class ZZZTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer(); //工具类的对象
        enhancer.setSuperclass(Searcher.class);//指定需要代理的业务类,继承自Searcher
        enhancer.setCallback(new SearchInterceptor());//设置回调对象,实现interceptor方法，供回调使用

        Searcher proxy = (Searcher) enhancer.create();//创建代理的对象
        proxy.doSearch();

        /**
        代理对象继承于Search，拦截器调用intercept()方法，
        intercept()方法由自定义SearchInterceptor实现，所以，最后调用SearchInterceptor中
        的intercept()方法，从而完成了由代理对象访问到目标对象的动态代理实现。
         **/
    }
}

cglib动态代理

cglib无法代理 final修饰的类和方法


1.JDK动态代理是实现了被代理对象的接口，Cglib是继承了被代理对象。  
2.JDK和Cglib都是在运行期生成字节码，JDK是直接写Class字节码，Cglib使用ASM框架写Class字节码，Cglib代理实现更复杂，生成代理类比JDK效率低。  
3.JDK调用代理方法，是通过反射机制调用，Cglib是通过FastClass机制直接调用方法，Cglib执行效率更高。  


https://www.cnblogs.com/adamjwh/p/10907526.html
https://blog.csdn.net/yhl_jxy/article/details/80633194
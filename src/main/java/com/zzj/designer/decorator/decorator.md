装饰者模式

动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活，不改变接口的前提下，增强所考虑的类的性能。  
使用场景：  
1.需要扩展一个类的功能，或给一个类增加附加责任。  
2.需要动态的给一个对象增加功能，这些功能可以再动态地撤销。  
3.需要增加一些基本功能的排列组合而产生的非常大量的功能，从而使继承变得不现实。  


装饰模式在 Java 语言中的最著名的应用莫过于 Java I/O 标准库的设计了。
例如，InputStream 的子类 FilterInputStream，
OutputStream 的子类 FilterOutputStream，Reader 的子类 BufferedReader 以及 FilterReader，
还有 Writer 的子类 BufferedWriter、FilterWriter 以及 PrintWriter 等，它们都是抽象装饰类。  


装饰模式与类继承的区别  
1)装饰模式是一种动态行为，对已经存在类进行随意组合，而类的继承是一种静态的行为，一个类定义成什么样的，该类的对象便具有什么样的功能，无法动态的改变。  
2)装饰模式扩展的是对象的功能，不需要增加类的数量，而类继承扩展是类的功能，在继承的关系中，如果我们想增加一个对象的功能，我们只能通过继承关系，在子类中增加方法。  
3)装饰模式是在不改变原类文件和使用继承的情况下，动态的扩展一个对象的功能，它是通过创建一个包装对象，也就是装饰来包裹真是的对象。  


参考  
https://www.cnblogs.com/adamjwh/p/9036358.html  
https://blog.csdn.net/zhshulin/article/details/38665187  
https://www.cnblogs.com/jzb-blog/p/6717349.html  
https://www.cnblogs.com/lilinzhiyu/p/9916234.html
https://blog.csdn.net/chaos_le/article/details/81007164


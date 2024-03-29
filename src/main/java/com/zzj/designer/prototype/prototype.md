浅复制 —-只是拷贝了基本类型的数据，而引用类型数据，复制后也是会发生引用，我们把这种拷贝叫做“（浅复制）浅拷贝”，换句话说，浅复制仅仅是指向被复制的内存地址，如果原地址中对象被改变了，那么浅复制出来的对象也会相应改变。

深复制 —-在计算机中开辟了一块新的内存地址用于存放复制的对象。

1. 何时使用  
当一个系统应该独立于它的产品创建、构成和表示时。  
当要实例化的类是在运行时刻指定时（如动态装载）。  
为了避免创建一个与产品类层次平行的工厂类层次时。  
当一个类的实例只能有几种几个不同状态组合中的一种时。  
2. 优点  
性能优良。不用重新初始化对象，而是动态地获取对象运行时的状态。  
逃避构造函数的约束。  
原型模式是在内存中二进制流的拷贝，要比new一个对象的性能要好，特别是需要产生大量对象时。  
3. 缺点  
配置克隆方法需要对类的功能进行通盘考虑。  
必须实现Cloneable接口。  
直接在内存中拷贝，构造函数是不会执行的，这样就减少了约束，这既是优点也是缺点，需要在实际应用中去考量。  
4. 使用场景  
如果类的初始化需要耗费较多的资源，那么可以通过原型拷贝避免这些消耗。  
通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。  
一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以拷贝多个对象供调用者使用，即保护性拷贝。  
资源优化场景。  
性能和安全要求的场景。  
一个对象多个修改者的场景。  
一般与工厂方法模式一起出现，通过clone方法创建一个对象，然后由工厂方法提供给调用者。  
5. 应用实例
细胞分裂
Java中的Object.clone()方法
复印


浅拷贝（Shallow Copy）：  
①对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。因为是两份不同的数据，所以对其中一个对象的该成员变量值进行修改，不会影响另一个对象拷贝得到的数据。  
②对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。  


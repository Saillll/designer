#一
适配器模式总结  

###优点：  
1.将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。  
2.增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用。  
3.灵活性和扩展性都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原有代码的基础上增加新的适配器类，完全符合“开闭原则”。  

####类适配器模式优点：  
由于适配器类是适配者类的子类，因此可以在适配器类中置换一些适配者的方法，使得适配器的灵活性更强。
  
####对象适配器模式优点：
一个对象适配器可以把多个不同的适配者适配到同一个目标；  
可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类也可通过该适配器进行适配。  

####类适配器模式缺点：  
对于Java、C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者；  
适配者类不能为最终类，如在Java中不能为final类，C#中不能为sealed类；  
在Java、C#等语言中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。 
 
####对象适配器模式缺点：  
与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，可以先做一个适配者类的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，实现过程较为复杂。  

####适用场景：  
系统需要使用一些现有的类，而这些类的接口（如方法名）不符合系统的需要，甚至没有这些类的源代码。  
想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。  

#二
1. 何时使用  
系统需要使用现有的类，而此类的接口不符合系统的需要。  
想建立一个可以重复使用的类，用于一些彼此之间没有太大关联的一些类。  
通过接口转换，将一个类插入另一个类系中。  
2. 方法  
继承或依赖。  
3. 优点  
可以让任何两个没有关联的类一起运行。  
增加了类的透明性。我们访问Target目标角色，但具体实现都委托给了源角色，而这些对高层模块是透明的，也是不需要关心的。  
提高了类的复用度。源角色在原有的系统中还是可以正常使用，而在目标角色中也可以充当新的演员。  
灵活性非常好。什么时候不想要适配器了，直接删掉就可以了，基本上就类似一个灵活的构件，想用就用，不想用就卸载。  
4. 缺点  
过多使用适配器，会使系统非常零乱。  
由于Java至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。  
5. 使用场景  
有动机地修改一个正常运行的系统的接口。  
6. 应用实例  
电源适配器。  
在Linux上运行Windows程序。  
Java中的JDBC。  
翻译官。  
7. 注意事项
只有碰到无法改变原有设计和代码的情况下，才考虑适配器模式。  

从上面的内容可以看出来，类适配器是类间继承，对象适配器是对象的合成关系，也可以说是类的关联关系，这是两者的根本区别。  
由于对象适配器是通过类间的关联关系进行耦合的，因此在设计时就可以做到比较灵活，而类适配器就只能通过覆写源角色的方法进行扩展。  
在实际项目中，对象适配器使用到的场景较多。  


#三
     有时我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法，这明显有时比较浪费，因为并不是所有的方法都是我们需要的，有时只需要某一些，此处为了解决这个问题，我们引入了接口的适配器模式，借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行。






















参考资料  
https://www.cnblogs.com/adamjwh/p/9033549.html
一、什么是设计模式
       设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。

二、设计模式的基本原则
　　1. 单一职责原则（Single Responsibility Principle，SRP）
       类的职责要单一。就一个类而言，应该仅有一个引起它变化的原因。

       举个简单的例子，我们现在很多时候都直接使用手机拍照，但新闻、时尚杂志等的拍照使用的是相机。手机其实就相当于把相机耦合到手机中去了，而相机却只有拍照这一个职责。大多数时候，一件产品简单一些，职责单一一些，或许是更好的选择，这就是单一职责原则。

       如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其它职责的能力。

　　2. 开闭原则（Open Close Principle，OCP）
       软件实体可扩展，但不可修改。
       就好比“一国两制”，一个国家有两种制度，没有修改原有的管理制度，而是增加了一种新的制度。正所谓对于扩展的开放的，对于更改是封闭的。

　　3. 依赖倒转原则（Dependence Inversion Principle，DIP）
       高层模块不应该依赖底层模块，两个都应该依赖抽象；抽象不应该依赖细节，细节应该依赖抽象。后面这句话换个方式说就是针对接口编程，不要对实现编程。

       举个例子，就好比你的电脑，如果CPU、内存、硬盘都需要依赖具体的主板，主板坏了，所有的部件都不能用了，这显然是不合理的。

       换句话说，即谁也不要依赖谁，除了约定的接口，大家都可以灵活自如。

　　4. 里氏代换原则（Liskov Substitution Principle，LSP）
       子类型必须能够替换掉它们的父类型。

       举个例子，假如现在父类是鸟类，有个属性是可以飞，子类有个企鹅类，那么很明显企鹅类不能继承鸟类，因为鸟类有会飞的属性，如果子类企鹅类继承父类鸟类，则企鹅必须会飞。

　　5. 接口隔离原则（Interface Segregation Principle，ISP）
       接口尽量细化，同时接口中的方法尽量少。

       举个设计模式之禅中的例子，星探找美女，星探要去找美女，他需要通过一个标准来找，比如可以分为外形美女和气质美女（即两个接口），这样不管以后是要气质美女还是外形美女，都可以保持接口的稳定。

　　6. 迪米特法则（Law of Demeter，LoD）/最少知识原则（Least Knowledge Principle，LKP）
       一个类对自己依赖的类知道的越少越好；一个对象应该对其他对象有最少的了解。

       比如体育老师上课前清点人数，他让体育委员来替他清点人数，之后再由体育委员告知结果即可，老师本身并没有接触到其他学生。

       换句话说，每个类都应该尽量降低成员的访问权限，强调了类之间的松耦合。

　　7. 合成/聚合复用原则（Composite/Aggregate Reuse Principle，CARP）
       尽量使用合成/聚合，尽量不要使用类继承。

       合成表示一种强的“拥有”关系，体现了严格的部分与整体的关系，他们的生命周期相同；而聚合表示一种弱的“拥有”关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分。

       这里再举个简单的例子，大雁与翅膀是合成关系；而每只大雁都属于一个雁群，即一个雁群可以有多只大雁，所以大雁和雁群是聚合关系。

三、设计模式的类型
       常见的设计模式有23种，这些模式可分为三大类：创建型模式、结构型模式、行为型模式。

       创建型模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用new运算符直接实例化对象；结构型模式主要关注类和对象的组合；行为型模式特别关注对象间的通信。

<h3>创建型模式：</h3>
<ul>
<li><span style="font-size: 14px;">&nbsp;<a href="#" target="_blank">单例模式</a></span></li>
<li><span style="font-size: 14px;">&nbsp;<a href="#" target="_blank">工厂方法模式</a>（工厂模式）</span></li>
<li><span style="font-size: 14px;">&nbsp;<a href="#" target="_blank">抽象工厂模式</a></span></li>
<li><span style="font-size: 14px;">&nbsp;<a href="#" target="_blank">建造者模式</a>（生成器模式）</span></li>
<li><span style="font-size: 14px;">&nbsp;<a href="#" target="_blank">原型模式</a></span></li>


</ul>
<h3>结构型模式：</h3>
<ul>
<li><span style="font-size: 14px;"><a href="#" target="_blank">适配器模式</a>（变压器模式/包装模式）</span></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">桥接模式</a>（桥梁模式）</span></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">组合模式</a>（合成模式/部分-整体模式）</span></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">装饰模式</a>（装饰器模式）</span></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">外观模式</a>（门面模式）</span></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">享元模式</span></a></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">代理模式</a>（委托模式）</span></li>

</ul>
<h3>行为型模式：</h3>
<ul>
<li><span style="font-size: 14px;"><a href="#" target="_blank">观察者模式</a>（发布订阅模式）</span></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">模板方法模式</span></a></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">命令模式</span></a></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">状态模式</span></a></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">职责链模式</a>（责任链模式）</span></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">解释器模式</span></a></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">中介者模式</span></a></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">访问者模式</span></a></li>
<li><span style="font-size: 14px;"><a href="#" target="_blank">策略模式</a>（政策模式）</span></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">备忘录模式</span></a></li>
<li><a href="#" target="_blank"><span style="font-size: 14px;">迭代器模式</span></a></li>
</ul>

原文参考  
https://www.cnblogs.com/adamjwh/p/9033545.html
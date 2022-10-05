## 适配器模式
示例代码：
### 接口定义
```java
public interface ITarget {
    void f1();
    void f2();
    void fc();
}

public class Adaptee {
    public void fa() { //... }
    public void fb() { //... }
    public void fc() { //... }
}
```
### 类适配器模式
```java
// 类适配器: 基于继承
public class Adaptor extends Adaptee implements ITarget {
    public void f1() {
        super.fa();
    }

    public void f2() {
        //...重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
```
### 对象适配器模式
```java
// 对象适配器：基于组合
public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa(); //委托给Adaptee
    }

    public void f2() {
        //...重新实现f2()...
    }

    public void fc() {
        adaptee.fc();
    }
}
```

### 解析
应该使用哪种方式实现，还是要分析ITarget接口和Adaptee类的具体情况。
适配器模式就是为了**解决Adaptee提供的功能与接口ITarget提供的功能不匹配（适配）
的问题**。思路就是新建一个适配器类Adaptor，让它实现ITarget接口，从何获得目标功能；
再将新功能与Adaptee已有的功能集成，达到适配目的。

如果新增的功能（ITarget接口方法）与原有功能（Adaptee成员方法）较少，
大部分功能都能复用Adaptee自身，那么用类适配器更合适，实现简单。

如果Adaptee与接口差异较大，原有代码可复用部分较少，那就是使用组合方式，可以在适当的
时候灵活调用原有方法。

一个直观感受是，适配器模式在**代码重构**时十分有用，有些类的功能不好完全重写，又要适配
新的接口，此时就可以构建适配器类达到目的。

一个场景是，某个**功能实现依赖多个外部系统（类）**，通过适配器类可以统一多个接口的定义。
参见代码。
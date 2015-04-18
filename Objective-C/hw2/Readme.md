# Exercises

* 为 XYZPerson 添加一个 sayHello 方法，使用人的名和姓来加载一句打招呼的话。
* 声明并实现一个新的指定初始器（ designated initializer ），用来创建一个XYZPerson类，该类使用指定姓、名、和生日日期， 同时还包含合适的类制造方法（ class factory method ）
* 测试当你设置可变字符串（ mutable string ）做为人名，然后在调用你添加的 sayHello 方法之前，改变人名字符串的值会出现的情况。为 NSString 属性声明添加备份特征，再测试一次。
* 尝试使用main() 函数中各种强、弱变量来创建  XYZPerson 对象。验证强变量会按照你期望的那样，保持XYZPerson对象活动。
为了验证一个 XYZPerson 对象是在何时被释放的，你可能会想通过在  XYZPerson 实现中添加一个 dealloc 方法，来将它与对象的生命周期关联起来。当一个ObjC 对象从内存中释放时这个方法会被自动调用，同时该方法也可以用于释放你手动分配的内存，就像C中的 malloc() 函数一样，参看[Advanced Memory Management Programming Guide](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/MemoryMgmt/Articles/MemoryMgmt.html#//apple_ref/doc/uid/10000011i)

为了这种目的的练习，覆写  XYZPerson 中的 dealloc 方法来加载消息，像这样：
 
```   
    - (void)dealloc {
    NSLog(@"XYZPerson is being deallocated");
    }
```
    
尝试通过设置  XYZPerson 中的每一个指针变量为 nil ，来验证对象如你所期待的那样被
释放了。

 **注：**  在 Xcode 工程中，为命令行提供的样板，在 main() 函数内使用 @autoreleasepool { }  块，以达到使用编译器的自动保留计数功能，来为你处理内存管理。你在main() 函数中写的任何代码都会进入自动释放池（ autoreleasepool ），这点是非常重要的。

自动释放池在本文档中没有涉及，更多细节参看[Advanced Memory Management Programming Guide](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/MemoryMgmt/Articles/MemoryMgmt.html#//apple_ref/doc/uid/10000011i)

当你正在编写 Cocoa 或 Cocoa Touch 应用而不是命令行时，你不需要过多的担心关于创建你自己的自动释放池的问题，因为那样你就在尝试进入对象的构架中，而这个构架却可以保证这个池的正确存在。

* 更改类的描述，使你可以跟踪配偶（spouse）或伙伴（partner）。你需要考虑怎样才能最好的模拟这种关系——你可以认真思考一下对象图管理。
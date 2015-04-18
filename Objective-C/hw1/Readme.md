# Exercises

使用 Xcode 的新项目模板窗口从可用的 OS X 应用程序项目模板创建一个命令行工具。出现提示时，指定为基础的项目类型。

* 使用 Xcode 的新文件模板窗口创建名为的接口和实现文件。其中 XYZPerson 继承于 NSObject。
* 向 XYZPerson 类接口添加属性为一个人的名字、 姓氏和 出生日期的类。（日期由 NSDate 类描述） 的出生日期。
* 声明 sayHello 的方法，并像前文所述那样实现它。
* 在你的项目里从上一章最后的练习中打开 main.m 文件并且找到 main() 函数。作为对于任何用 C 语言写的可执行的程序，这个函数代表了你应用的起点。

* 在你的项目里从上一章最后的练习中打开 `main.m` 文件并且找到 `main()` 函数。作为对于任何用 C 语言写的可执行的程序，这个函数代表了你应用的起点。

使用 `alloc` 和 `init` 创建一个新的 `XYZPerson` 实例，然后调用 `sayHello` 方法。

**注解**：如果编译器没有自动提示你，你将需要在 `main.m` 的顶部导入头文件(包含 `XYZPerson` 接口)

* 实现在这一章早些时候展示的方法 `saySomething：`,并且重新编写方法 `sayHello` 来使用它。添加各种其他的问候并且在你之前创建的每一个实例上调用它们。

* 为 `XYZShoutingPerson` 类创建新的类文件，设置成继承自 `XYZPerson`。

覆写 `saySomething:` 方法来展示大写的问候，并且测试在 `XYZShoutingPerson` 实例上的行为。

* 实现在前一章你声明的 `XYZPerson` 类 `person` 工厂方法，来返回一个被正确分配和初始化的 `XYZPerson` 类的实例，然后在 `main()` 中使用方法来代替嵌套的 `alloc` 和 `init`。

提示：尝试使用 [[self alloc] init] 而不是使用 [[XYZPerson alloc] init]。

在一个类工厂方法中使用 `self` 意味着你在指向类本身。

这意味着你不必在 `XYZShoutingPerson` 实现中覆写 `person` 方法来创建正确的实例。通过检查以下代码来测试这个：

```
    XYZShoutingPerson *shoutingPerson = [XYZShoutingPerson person];
```

创建正确类型的对象。

* 创建一个新的局部的 `XYZPerson` 指针，但是不包括任何其他赋值。
使用一个转移指令（`if` 声明）来检查变量是否自动被赋为 `nil`。
#Exercises

* 添加一个 category 到 XYZPerson 类来声明和继承附加的功能，例如以不同的方式显示一个人的名字。

* 向 NSString 类 添加一个 category，以添加一个方法来在给定位置绘制全部字母大写的字符串，通过调用到一个现有的 NSStringDrawing  category 方法来执行实际的绘制。  
这些方法都记录在 iOS 的 NSString UIKit Additions Reference 中和 OSX 的 [NSString Application Kit Additions Reference](https://developer.apple.com/library/mac/documentation/Cocoa/Reference/ApplicationKit/Classes/NSString_AppKitAdditions/index.html#//apple_ref/doc/uid/TP40004121)中。

* 将两个只读属性添加到原始 XYZPerson 类的继承中，来代表一个人的身高和体重，分别是 measureWeight 和 measureHeight 方法。  
使用类扩展重新声明属性为读写属性，并继承以便将属性设置为适当的值。

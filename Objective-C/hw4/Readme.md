# Note

### ViewController

* 生命周期

1. alloc 创建对象，分配空间
2. init(initWithNibName) 初始化对象，初始化数据
3. loadView 从nib载入视图
4. viewDidUnload 内存吃紧时候调用
5. viewDidLoad view载入完成
6. viewWillAppear 视图展示前
7. viewDidAppear 视图展示后
8. viewWillDisappear 视图消失前
9. viewDidDisappear 视图消失后
10. dealloc 视图被销毁

* loadView

![loadView](http://img.blog.csdn.net/20130621105945796?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveHl6X2xtbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

* unloadView

![unloadView](http://img.blog.csdn.net/20130621105956156?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveHl6X2xtbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)


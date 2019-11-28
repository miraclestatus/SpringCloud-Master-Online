# SpringCloud-Master-Online
使用springcloud技术构建一个在线学习网站
# 第一步，搭建CMS系统管理工程
# 第二部

前台项目结构
![](https://upload-images.jianshu.io/upload_images/13248401-54ec8122d84f96f6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/13248401-e154013d2d0bcd93.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](https://upload-images.jianshu.io/upload_images/13248401-1061bb73e32c3bbf.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
1.url_for()作用:
(1)给指定的函数构造 URL。
(2)访问静态文件(CSS / JavaScript 等)。 只要在你的包中或是模块的所在目录中创建一个名为 static 的文件夹，在应用中使用 /static 即可访问。

1.1给指定的函数构造 URL:
它接受函数名作为第一个参数，也接受 URL 规则中对应的变量作为参数。未知变量部分会添加到 URL 末尾作为查询参数。
### 访问静态文件
```
url_for('static', filename='style.css')
这个文件应该存储在文件系统上的 static/style.css 
```

# CAMan
Dynamic Cloud Application Management System

## What is CAman?

CAMan (Cloud Application Management System) 是一种基于模型的云应用动态管理技术。该技术在Eclipse Modeling Framework上实现，并且结合了Graphic Modeling Framework提供上层图形用户界面。

## 环境配置

**注意**：所有环境配置在Windows 7平台进行过完整的测试，尽管我相信在其他平台同样可以正确运行，但无法完全保证，如果出现问题请参阅*常见错误处理*寻找灵感。

### Java环境

本技术的多项依赖技术都需要特定的Java版本，经实际测试Java SE 1.6或1.7可以在大多数情况下满足要求，
对于特殊情况请参阅*常见错误处理*。

下载地址：

[Java SE Development Kit 6](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase6-419409.html)

[Java SE Development Kit 7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)

### Eclipse以及相关插件

SandTablist插件需要Eclipse Modeling Framework 3.4，Eclipse-OCL 1.3, EMF-Transaction 1.3, Graphical Modeling Framework (GMF) 2.1。在实际使用中推荐下载Eclipse Modeling Tool，该工具集成了绝大多数相关框架和插件。

下载地址：

Eclipse Modeling Tool Luna [Windows 32 Bit](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32.zip)
，[Windows 64 Bit](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/luna/SR2/eclipse-modeling-luna-SR2-win32-x86_64.zip)
，其他平台的下载请到Eclipse官网搜索。

经测试，Indigo版本也同样可以使用，下载地址：
[Eclipse Modeling Tool Indigo](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2)

### SM@RT插件

从[这里](http://smatrt.googlecode.com/files/smatrt.zip)下载SM@RT，获得一个压缩文件，里面是一些eclipse插件（\*.jar文件）。以标准方式安装这些插件，即将这个压缩文件复制到你的eclipse安装路径下，通常是"\*/eclipse/"的形式，在这个路径下可以找到**eclipse.exe**文件，以及一些子文件夹比如“features”、“plugins”，解压缩这个文件，并将5个插件放到“plugins”文件夹下。

### GMF

如果你的Eclipse Modeling Tool中没有GMF插件，则可以打开*Help*的*Install Modeling Components*，搜寻“Graphic Modeling Framework"并安装。

## 开发过程

## 使用方法

如果你只想尝试使用一下该技术，但并不想进行完整的开发，请参照以下步骤（以Web应用管理系统为例）。

1. 打开配置好的Eclipse Modeling Tool，导入**Web**目录中的**OSModel**项目，注意不需要导入其他以OSModel开头的项目。
2. 以Ecore视图打开**model**文件夹中的**OSModel.ecore**，修改其Name和URI属性为自己想要的设置
3. 新建**EMF Generator Model**，选择导入刚刚的**OSModel.ecore**，用该genmodel生成除了**Model Code**之外的其他Code。
4. 打开**OSModel.decmodel**，右键**Load Resources**导入Ecore模型和Genmodel，在**SandTablist**选项卡中点击**Generate Adapter**，
将会生成主要的同步引擎代码。
5. 运行生成的同步引擎。在**OSModel**项目上右键选择**Run As**，以及**Eclipse Application**。将会启动一个新的runtime eclipse，
新建**Example EMF Model Creation Wizards**，并选择之前指定的模型名字。
6. 在新建的运行时模型上增加、删除、修改元素，查看效果。
7. 在原来的Eclipse中右键**OSModel.gmfgen**，然后选择**Generate diagram code**，会生成一个新的项目。启动该项目，
并新建**Examples**中的**Diagram**模型，即可以使用拖放式图形用户界面。


## 常见错误处理

如果出现错误，请查看下面的内容是否能够帮助你

1. gmfgen生成diagram时一直报boolean类型相关错误
>将project的Java版本临时改成jre6，重新生成genmodel，再使用新的gmfgen进行后续步骤。

2. 新建GMF工具时没有任何选项
> 新建GMF Mapping时一定要从root开始。

3. 生成的同步引擎代码中有类型错误
> genmodel中的Model Class Default：Root Extends Class改成org.eclipse.emf.ecore.impl.EObjectImpl

4. 无法增加新的依赖
> 复制依赖库到在lib文件中，在Eclipse中打开MANIFEST.MF，点击Runtime选项卡，，将新增的依赖库加入Classpath。然后
点击Dependencies选项卡，增加依赖的项目，并且勾选"Show non-exported package"。

5. 运行项目是报依赖不满足的错误
> 将"cn.pku"开头的几个包全部加到依赖中，注意是在Dependencies的Reguired Plugin-ins中添加

6. 生成虚拟机时报了OpenStack相关的错误
> 使用OpenStack API时一定要配合JDK 1.7使用，其他版本都无法正常运行。

7. 更换GMF图标后重新运行并没有载入最新的图标
> 图标文件一定要以.gif为后缀，不接受其他格式的图片，且请确保图片放在了icons/full/obj16文件夹内

8. 试在SandTablist选项卡中生成代码时相应按钮为灰色
> 关闭decmodel，重新载入所有相关资源，再进行尝试。

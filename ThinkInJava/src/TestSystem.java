

import java.util.Properties;

public class TestSystem {

	/**
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(System.getProperty("user.dir"));
		
		// 常用的时间:
		System.out.println(System.currentTimeMillis());

		// 获得当前的系统属性
		Properties p = System.getProperties(); 
		// 在标准输出流中打印p的列表
		p.list(System.out); 
		System.out.println(" -------获得项目的地址-------- ");
		System.out.println(p.getProperty("user.dir"));
		System.out.println(" --------获得编译后的文件存放地址------- ");
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(" --------获得系统当前欲行状态------- ");
		// 返回与当前 Java 应用程序相关的运行时对象。Runtime 类的大多数方法是实例方法，并且必须根据当前的运行时对象对其进行调用。 
		Runtime rt = Runtime.getRuntime(); 
		System.out.println("Total Memory 总的内存 = " + rt.totalMemory() + " Free Memory 空闲内存 = " + rt.freeMemory());
		System.out.println(" --------垃圾回收------- ");
		System.gc();
		Runtime rt2 = Runtime.getRuntime(); 
		System.out.println("Total Memory 总的内存 = " + rt2.totalMemory() + " Free Memory 空闲内存 = " + rt2.freeMemory());
        /**
         * Windows XP


E:\Workspaces\ThinkInJava
1306864202875
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=D:\Program Files\Java\jre6\bin
java.vm.version=11.3-b02
java.vm.vendor=Sun Microsystems Inc.
java.vendor.url=http://java.sun.com/
path.separator=;
java.vm.name=Java HotSpot(TM) Client VM
file.encoding.pkg=sun.io
user.country=CN
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=Service Pack 3
java.vm.specification.name=Java Virtual Machine Specification
user.dir=E:\Workspaces\ThinkInJava
java.runtime.version=1.6.0_13-b03
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=D:\Program Files\Java\jre6\lib\endorsed
os.arch=x86
java.io.tmpdir=C:\DOCUME~1\ADMINI~1\LOCALS~1\Temp\
line.separator=

java.vm.specification.vendor=Sun Microsystems Inc.
user.variant=
os.name=Windows XP
sun.jnu.encoding=GBK
java.library.path=D:\Program Files\Java\jre6\bin;.;C:\W...
java.specification.name=Java Platform API Specification
java.class.version=50.0
sun.management.compiler=HotSpot Client Compiler
os.version=5.1
user.home=C:\Documents and Settings\Administrator
user.timezone=
java.awt.printerjob=sun.awt.windows.WPrinterJob
file.encoding=GBK
java.specification.version=1.6
user.name=Administrator
java.class.path=E:\Workspaces\ThinkInJava\bin;D:\Prog...
java.vm.specification.version=1.0
sun.arch.data.model=32
java.home=D:\Program Files\Java\jre6
java.specification.vendor=Sun Microsystems Inc.
user.language=zh
awt.toolkit=sun.awt.windows.WToolkit
java.vm.info=mixed mode, sharing
java.version=1.6.0_13
java.ext.dirs=D:\Program Files\Java\jre6\lib\ext;C:...
sun.boot.class.path=D:\Program Files\Java\jre6\lib\resour...
java.vendor=Sun Microsystems Inc.
file.separator=\
java.vendor.url.bug=http://java.sun.com/cgi-bin/bugreport...
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.desktop=windows
sun.cpu.isalist=pentium_pro+mmx pentium_pro pentium+m...
 -------获得项目的地址-------- 
E:\Workspaces\ThinkInJava
 --------获得编译后的文件存放地址------- 
E:\Workspaces\ThinkInJava\bin;D:\Program\MyEclipse 6.0\eclipse\plugins\org.junit_3.8.2.v200706111738\junit.jar;F:\文辉\学习.开发.Jar包\mysql-connector-java-5.1.16\mysql-connector-java-5.1.16\mysql-connector-java-5.1.16-bin.jar;F:\文辉\学习.开发.Jar包\J3D\j3dcore.jar;F:\文辉\学习.开发.Jar包\J3D\j3dutils.jar;F:\文辉\学习.开发.Jar包\J3D\vecmath.jar;F:\文辉\学习.开发.Jar包\postgresql-8.4-702.jdbc4.jar
 --------获得系统当前欲行状态------- 
Total Memory 总的内存 = 5177344 Free Memory 空闲内存 = 4916984
 --------垃圾回收------- 
Total Memory 总的内存 = 5177344 Free Memory 空闲内存 = 5015704
         */

	}

}
/*
 setIn
public static void setIn(InputStream in)重新分配“标准”输入流。 
首先，如果有安全管理器，则通过 RuntimePermission("setIO") 权限调用其 checkPermission 方法，查看是否可以重新分配“标准”输入流。 



参数：
in - 新的标准输出流。 System.in 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许重新分配标准输入流。
从以下版本开始： 
JDK1.1 
另请参见：
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

setOut
public static void setOut(PrintStream out)重新分配“标准”输出流。 
首先，如果有安全管理器，则通过 RuntimePermission("setIO") 权限调用其 checkPermission 方法，查看是否可以重新分配“标准”输出流。 


参数：
out - 新的标准输出流 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许重新分配标准输出流。
从以下版本开始： 
JDK1.1 
另请参见：
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

setErr
public static void setErr(PrintStream err)重新分配“标准”错误输出流。 
首先，如果有安全管理器，则通过 RuntimePermission("setIO") 权限调用其 checkPermission 方法，查看是否可以重新分配“标准”输出流。 


参数：
err - 新的标准错误输出流 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许重新分配标准错误输出流。
从以下版本开始： 
JDK1.1 
另请参见：
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

inheritedChannel
public static Channel inheritedChannel()
                                throws IOException返回从创建此 Java 虚拟机的实体中继承的信道。 
此方法返回通过调用系统级默认 SelectorProvider 对象的 inheritedChannel 方法获得的信道。 

除了 inheritedChannel 中描述的面向网络的信道之外，此方法以后还可能返回其他种类的信道。 


返回：
继承的信道（如果有），否则返回 null。 
抛出： 
IOException - 如果发生 I/O 错误 
SecurityException - 如果安全管理器存在并且它不允许访问信道。
从以下版本开始： 
1.5 

--------------------------------------------------------------------------------

setSecurityManager
public static void setSecurityManager(SecurityManager s)设置系统安全性。 
如果已经安装了安全管理器，则此方法首先通过 RuntimePermission("setSecurityManager") 权限调用安全管理器的 checkPermission 方法，以确保可以替换现有的安全管理器。这可能导致抛出一个 SecurityException 异常。 

否则，将该参数作为当前安全管理器建立。如果参数为 null 并且没有建立安全管理器，则不执行任何操作，并且该方法将自行返回。 


参数：
s - 安全管理器。 
抛出： 
SecurityException - 如果安全管理器已经设置并且其 checkPermission 方法不允许替换该设置。
另请参见：
getSecurityManager(), SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

getSecurityManager
public static SecurityManager getSecurityManager()获得系统安全接口。 

返回：
如果已经为当前应用程序建立了安全管理器，则返回此安全管理器；否则，返回 null。
另请参见：
setSecurityManager(java.lang.SecurityManager)

--------------------------------------------------------------------------------

currentTimeMillis
public static long currentTimeMillis()返回以毫秒为单位的当前时间。注意，当返回值的时间单位是毫秒时，值的粒度取决于基础操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间。 
请参阅 Date 类的描述，了解可能发生在“计算机时间”和协调世界时（UTC）之间的细微差异的讨论。 


返回：
当前时间与协调世界时 1970 年 1 月 1 日午夜之间的时间差（以毫秒为单位测量）。
另请参见：
Date

--------------------------------------------------------------------------------

nanoTime
public static long nanoTime()返回最准确的可用系统计时器的当前值，以毫微秒为单位。 
此方法只能用于测量已过的时间，与系统或钟表时间的其他任何时间概念无关。返回值表示从某一固定但任意的时间算起的毫微秒数（或许从以后算起，所以该值可能为负）。此方法提供毫微秒的精度，但不是必要的毫微秒的准确度。它对于值的更改频率没有作出保证。在取值范围大于约 292 年（263 毫微秒）的连续调用的不同点在于：由于数字溢出，将无法准确计算已过的时间。 

例如，测试某些代码执行的时间长度： 

   long startTime = System.nanoTime();
   // ... the code being measured ...
   long estimatedTime = System.nanoTime() - startTime;
 
返回：
系统计时器的当前值，以毫微秒为单位。
从以下版本开始： 
1.5 

--------------------------------------------------------------------------------

arraycopy
public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。从 src 引用的源数组到 dest 引用的目标数组，数组组件的一个子序列被复制下来。被复制的组件的编号等于 length 参数。源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。 
如果参数 src 和 dest 引用相同的数组对象，则复制的执行过程就好像首先将 srcPos 到 srcPos+length-1 位置的组件复制到一个带有 length 组件的临时数组，然后再将此临时数组的内容复制到目标数组的 destPos 到 destPos+length-1 位置一样。 

If 如果 dest 为 null，则抛出 NullPointerException 异常。 

如果 src 为 null, 则抛出 NullPointerException 异常，并且不会修改目标数组。 

否则，只要下列任何情况为真，则抛出 ArrayStoreException 异常并且不会修改目标数组： 

src 参数指的是非数组对象。 
dest 参数指的是非数组对象。 
src 参数和 dest 参数指的是那些其组件类型为不同基本类型的数组。 
src 参数指的是具有基本组件类型的数组且 dest 参数指的是具有引用组件类型的数组。 
src 参数指的是具有引用组件类型的数组且 dest 参数指的是具有基本组件类型的数组。 
否则，只要下列任何情况为真，则抛出 IndexOutOfBoundsException 异常，并且不会修改目标数组： 

srcPos 参数为负。 
destPos 参数为负。 
length 参数为负。 
srcPos+length 大于 src.length，即源数组的长度。 
destPos+length 大于 dest.length，即目标数组的长度。 
否则，如果源数组中 srcPos 到 srcPos+length-1 位置上的实际组件通过分配转换并不能转换成目标数组的组件类型，则抛出 ArrayStoreException 异常。在这种情况下，将 k 设置为比长度小的最小非负整数，这样就无法将 src[srcPos+k] 转换为目标数组的组件类型；当抛出异常时，从 srcPos 到 srcPos+k-1 位置上的源数组组件已经被复制到目标数组中的 destPos 到 destPos+k-1 位置，而目标数组中的其他位置不会被修改。（因为已经详细说明过的那些限制，只能将此段落有效地应用于两个数组都有引用类型的组件类型的情况。） 


参数：
src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目标数据中的起始位置。
length - 要复制的数组元素的数量。 
抛出： 
IndexOutOfBoundsException - 如果复制会导致对数组范围以外的数据的访问。 
ArrayStoreException - 如果因为类型不匹配而使得无法将 src 数组中的元素存储到 dest 数组中。 
NullPointerException - 如果 src 或 dest 为 null。

--------------------------------------------------------------------------------

identityHashCode
public static int identityHashCode(Object x)返回给定对象的哈希码，该代码与默认的方法 hashCode() 返回的代码一样，无论给定对象的类是否重写 hashCode()。null 引用的哈希码为零。 

参数：
x - 要计算其哈希码的对象 
返回：
哈希码
从以下版本开始： 
JDK1.1 

--------------------------------------------------------------------------------

getProperties
public static Properties getProperties()确定当前的系统属性。 
首先，如果有安全管理器，则不带参数直接调用其 checkPropertiesAccess 方法。这可能导致一个安全性异常。 

将 getProperty(String) 方法使用的当前系统属性集合作为 Properties 对象返回。如果没有当前系统属性集合，则先创建并初始化一个系统属性集合。这个系统属性集合总是包含以下键的值： 键 相关值的描述 
java.version Java 运行时环境版本 
java.vendor Java 运行时环境供应商 
java.vendor.url Java 供应商的 URL 
java.home Java 安装目录 
java.vm.specification.version Java 虚拟机规范版本 
java.vm.specification.vendor Java 虚拟机规范供应商 
java.vm.specification.name Java 虚拟机规范名称 
java.vm.version Java 虚拟机实现版本 
java.vm.vendor Java 虚拟机实现供应商 
java.vm.name Java 虚拟机实现名称 
java.specification.version Java 运行时环境规范版本 
java.specification.vendor Java 运行时环境规范供应商 
java.specification.name Java 运行时环境规范名称 
java.class.version Java 类格式版本号 
java.class.path Java 类路径 
java.library.path 加载库时搜索的路径列表 
java.io.tmpdir 默认的临时文件路径 
java.compiler 要使用的 JIT 编译器的名称 
java.ext.dirs 一个或多个扩展目录的路径 
os.name 操作系统的名称 
os.arch 操作系统的架构 
os.version 操作系统的版本 
file.separator 文件分隔符（在 UNIX 系统中是“/”） 
path.separator 路径分隔符（在 UNIX 系统中是“:”） 
line.separator 行分隔符（在 UNIX 系统中是“/n”） 
user.name 用户的账户名称 
user.home 用户的主目录 
user.dir 用户的当前工作目录 


系统属性值中的多个路径是用平台的路径分隔符分隔的。 

注意，即使安全管理器不允许执行 getProperties 操作，它可能也会选择允许执行 getProperty(String) 操作。 


返回：
系统属性 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPropertiesAccess 方法不允许访问系统属性。
另请参见：
setProperties(java.util.Properties), SecurityException, SecurityManager.checkPropertiesAccess(), Properties

--------------------------------------------------------------------------------

setProperties
public static void setProperties(Properties props)将系统属性设置为 Properties 参数。 
首先，如果有安全管理器，则不带参数直接调用其 checkPropertiesAccess 方法。这可能导致一个安全性异常。 

参数是 getProperty(String) 方法使用的当前系统属性的集合。如果参数为 null，则忽略当前系统属性的集合。 


参数：
props - 新的系统属性。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPropertiesAccess 方法不允许访问系统属性。
另请参见：
getProperties(), Properties, SecurityException, SecurityManager.checkPropertiesAccess()

--------------------------------------------------------------------------------

getProperty
public static String getProperty(String key)获得指定键指示的系统属性。 
首先，如果有安全管理器，则用该键作为其参数来调用 checkPropertyAccess 方法。结果可能导致 SecurityException。 

如果没有当前系统属性的集合，则首先用与 getProperties 方法相同的方式创建并初始化系统属性的集合。 


参数：
key - 系统属性的名称。 
返回：
系统属性的字符串值，如果没有带有此键的属性，则返回 null。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPropertyAccess 方法不允许访问指定的系统属性。 
NullPointerException - 如果 key 为 null。 
IllegalArgumentException - 如果 key 为空。
另请参见：
setProperty(java.lang.String, java.lang.String), SecurityException, SecurityManager.checkPropertyAccess(java.lang.String), getProperties()

--------------------------------------------------------------------------------

getProperty
public static String getProperty(String key,
                                 String def)获得用指定键描述的系统属性。 
首先，如果有安全管理器，则用该 key 作为参数调用 checkPropertyAccess 方法。 

如果没有当前系统属性的集合，将用与 getProperties 方法相同的方式首先创建并初始化系统属性的集合。 


参数：
key - 系统属性的名称。
def - 默认值。 
返回：
系统属性的字符串值，如果没有带有此键的属性，则返回默认值。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPropertyAccess 方法不允许访问指定的系统属性。 
NullPointerException - 如果 key 为 null。 
IllegalArgumentException - 如果 key 为空。
另请参见：
setProperty(java.lang.String, java.lang.String), SecurityManager.checkPropertyAccess(java.lang.String), getProperties()

--------------------------------------------------------------------------------

setProperty
public static String setProperty(String key,
                                 String value)设置指定键指示的系统属性。 
首先，如果安全管理器存在，则通过 PropertyPermission(key, "write") 权限调用其 SecurityManager.checkPermission 方法。这可能导致抛出 SecurityException。如果没有抛出异常，则将指定属性设置为给定值。 



参数：
key - 系统属性的名称。
value - 系统属性的值。 
返回：
系统属性以前的值，如果没有以前的值，则返回 null。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许设置指定属性。 
NullPointerException - 如果 key 或 value 为 null。 
IllegalArgumentException - 如果 key 为空。
从以下版本开始： 
1.2 
另请参见：
getProperty(java.lang.String), getProperty(java.lang.String), getProperty(java.lang.String, java.lang.String), PropertyPermission, SecurityManager.checkPermission(java.security.Permission)

--------------------------------------------------------------------------------

clearProperty
public static String clearProperty(String key)移除指定键指示的系统属性。 
首先，如果安全管理器存在，则通过 PropertyPermission(key, "write") 权限调用其 SecurityManager.checkPermission 方法。这可能导致抛出 SecurityException。如果没有抛出异常，则移除指定的属性。 



参数：
key - 要移除的系统属性的名称。 
返回：
系统属性以前的字符串值，如果带有此键的属性不存在，则返回 null。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPropertyAccess 方法不允许访问指定的系统属性。 
NullPointerException - 如果 key 为 null。 
IllegalArgumentException - 如果 key 为空。
从以下版本开始： 
1.5 
另请参见：
getProperty(java.lang.String), setProperty(java.lang.String, java.lang.String), Properties, SecurityException, SecurityManager.checkPropertiesAccess()

--------------------------------------------------------------------------------

getenv
public static String getenv(String name)获得指定的环境变量值。环境变量是一个取决于系统的外部命名的值。 
如果安全管理器存在，则通过 RuntimePermission("getenv."+name) 的权限调用其 checkPermission 方法。这可能导致抛出 SecurityException。如果没有抛出异常，则返回变量 name 的值。 

从概念上讲，系统属性 和环境变量 都是名称与值之间的映射。两种机制都能用来将用户定义的信息传递给 Java 进程。环境变量产生更多的全局效应，因为它们不仅对紧接着出现的 Java 子进程可见，而且对于定义它们的进程的所有子进程都是可见的。在不同的操作系统上，它们的语义有细微的差别，比如，不区分大小写。因为这些原因，环境变量更可能有意料不到的副作用。最好在可能的地方使用系统属性。环境变量应该在需要全局效应的时候使用，或者在外部系统接口要求使用环境变量时使用（比如 PATH）。 

在 UNIX 系统中，name 的字母大小写通常很重要，而在 Microsoft Windows 系统中，这通常不重要。例如，表达式 System.getenv("FOO").equals(System.getenv("foo")) 在 Microsoft Windows 中可能为真。 


参数：
name - 环境变量的名称 
返回：
变量的字符串值，如果变量不是在系统环境中定义的，则返回 null 
抛出： 
NullPointerException - 如果 name 为 null 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许访问环境变量 name
另请参见：
getenv(), ProcessBuilder.environment()

--------------------------------------------------------------------------------

getenv
public static Map<String,String> getenv()返回一个不能修改的当前系统环境的字符串映射视图。该环境是一个取决于系统的从名称到值的映射，它从父进程传递给子进程。 
如果系统不支持环境变量，则返回一个空映射。 

返回的映射永远不会包含 null 键或 Null 值。如果试图查询 null 键或 Null 值的存在，则会抛出 NullPointerException。如果试图查询不是 String 类型的键或值的存在，则会抛出 ClassCastException。 

返回的映射及其集合视图可能没有遵守 Object.equals(java.lang.Object) 和 Object.hashCode() 方法的通用协定。 

在所有的平台上，返回的映射通常都是区分大小写的。 

如果安全管理器存在，则通过 RuntimePermission("getenv.*") 权限调用 checkPermission 方法。这可能导致抛出 SecurityException。 

将信息传递给 Java 子进程时，系统属性一般优先于环境变量。 


返回：
作为变量名称到值的映射的环境 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkPermission 方法不允许访问进程环境
从以下版本开始： 
1.5 
另请参见：
getenv(String), ProcessBuilder.environment()

--------------------------------------------------------------------------------

exit
public static void exit(int status)终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非零的状态码表示异常终止。 
该方法调用 Runtime 类中的 exit 方法。该方法永远不会正常返回。 

调用 System.exit(n) 实际上等效于调用： 

 Runtime.getRuntime().exit(n)
 
参数：
status - 退出状态。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkExit 方法不允许以指定状态退出。
另请参见：
Runtime.exit(int)

--------------------------------------------------------------------------------

gc
public static void gc()运行垃圾回收器。 
调用 gc 方法暗示着 Java 虚拟机做了一些努力来回收未用对象，以便能够快速地重用这些对象当前占用的内存。当控制权从方法调用中返回时，虚拟机已经尽最大努力从所有丢弃的对象中回收了空间。 

调用 System.gc() 实际上等效于调用： 

 Runtime.getRuntime().gc()
 
另请参见：
Runtime.gc()

--------------------------------------------------------------------------------

runFinalization
public static void runFinalization()运行处于挂起终止状态的所有对象的终止方法。 
调用该方法说明 Java 虚拟机做了一些努力运行已被丢弃对象的 finalize 方法，但是这些对象的 finalize 方法至今尚未运行。当控制权从方法调用中返回时，Java 虚拟机已经尽最大努力去完成所有未执行的终止方法。 

调用 System.runFinalization() 实际上等效于调用： 

 Runtime.getRuntime().runFinalization()
 
另请参见：
Runtime.runFinalization()

--------------------------------------------------------------------------------

runFinalizersOnExit
@Deprecated
public static void runFinalizersOnExit(boolean value)已过时。 该方法具有固有的不安全性。它可能对正在使用的对象调用终结方法，而其他线程同时正在操作这些对象，从而导致不正确的行为或死锁。 

在退出时启用或禁用终结；这样做可指定，拥有未被自动调用终结方法的所有对象的终结方法在退出 Java 运行库前运行。默认情况下，禁用退出时终结。 
如果有安全管理器，则首先使用 0 作为参数来调用其 checkExit 方法，以确保允许退出。这可能导致抛出 SecurityException。 


参数：
value - 指示启用或禁用终止操作的值 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkExit 方法不允许退出。
从以下版本开始： 
JDK1.1 
另请参见：
Runtime.exit(int), Runtime.gc(), SecurityManager.checkExit(int)

--------------------------------------------------------------------------------

load
public static void load(String filename)从作为动态库的本地文件系统中以指定的文件名加载代码文件。文件名参数必须是完整的路径名。 
调用 System.load(name) 实际上等效于调用： 

 Runtime.getRuntime().load(name)
 
参数：
filename - 要加载的文件。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkLink 方法不允许加载指定的动态库。 
UnsatisfiedLinkError - 如果文件不存在。 
NullPointerException - 如果 filename 为 null
另请参见：
Runtime.load(java.lang.String), SecurityManager.checkLink(java.lang.String)

--------------------------------------------------------------------------------

loadLibrary
public static void loadLibrary(String libname)加载由 libname 参数指定的系统库。将库名映射到实际系统库的方法取决于系统。 
调用 System.loadLibrary(name) 实际上等效于调用： 

 Runtime.getRuntime().loadLibrary(name)
 
参数：
libname - 库名。 
抛出： 
SecurityException - 如果安全管理器存在并且其 checkLink 方法不允许加载指定的动态库。 
UnsatisfiedLinkError - 如果库不存在。 
NullPointerException - 如果 libname 为 null
另请参见：
Runtime.loadLibrary(java.lang.String), SecurityException, SecurityManager.checkLink(java.lang.String)

--------------------------------------------------------------------------------

mapLibraryName
public static String mapLibraryName(String libname)将一个库名称映射到特定于平台的、表示本机库的字符串中。 

参数：
libname - 库名。 
返回：
取决于平台的本机库名称。 
抛出： 
NullPointerException - 如果 libname 为 null。
从以下版本开始： 
1.2 
另请参见：
loadLibrary(java.lang.String), ClassLoader.findLibrary(java.lang.String)
 * */

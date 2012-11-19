

import java.util.Properties;

public class TestSystem {

	/**
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(System.getProperty("user.dir"));
		
		// ���õ�ʱ��:
		System.out.println(System.currentTimeMillis());

		// ��õ�ǰ��ϵͳ����
		Properties p = System.getProperties(); 
		// �ڱ�׼������д�ӡp���б�
		p.list(System.out); 
		System.out.println(" -------�����Ŀ�ĵ�ַ-------- ");
		System.out.println(p.getProperty("user.dir"));
		System.out.println(" --------��ñ������ļ���ŵ�ַ------- ");
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(" --------���ϵͳ��ǰ����״̬------- ");
		// �����뵱ǰ Java Ӧ�ó�����ص�����ʱ����Runtime ��Ĵ����������ʵ�����������ұ�����ݵ�ǰ������ʱ���������е��á� 
		Runtime rt = Runtime.getRuntime(); 
		System.out.println("Total Memory �ܵ��ڴ� = " + rt.totalMemory() + " Free Memory �����ڴ� = " + rt.freeMemory());
		System.out.println(" --------��������------- ");
		System.gc();
		Runtime rt2 = Runtime.getRuntime(); 
		System.out.println("Total Memory �ܵ��ڴ� = " + rt2.totalMemory() + " Free Memory �����ڴ� = " + rt2.freeMemory());
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
 -------�����Ŀ�ĵ�ַ-------- 
E:\Workspaces\ThinkInJava
 --------��ñ������ļ���ŵ�ַ------- 
E:\Workspaces\ThinkInJava\bin;D:\Program\MyEclipse 6.0\eclipse\plugins\org.junit_3.8.2.v200706111738\junit.jar;F:\�Ļ�\ѧϰ.����.Jar��\mysql-connector-java-5.1.16\mysql-connector-java-5.1.16\mysql-connector-java-5.1.16-bin.jar;F:\�Ļ�\ѧϰ.����.Jar��\J3D\j3dcore.jar;F:\�Ļ�\ѧϰ.����.Jar��\J3D\j3dutils.jar;F:\�Ļ�\ѧϰ.����.Jar��\J3D\vecmath.jar;F:\�Ļ�\ѧϰ.����.Jar��\postgresql-8.4-702.jdbc4.jar
 --------���ϵͳ��ǰ����״̬------- 
Total Memory �ܵ��ڴ� = 5177344 Free Memory �����ڴ� = 4916984
 --------��������------- 
Total Memory �ܵ��ڴ� = 5177344 Free Memory �����ڴ� = 5015704
         */

	}

}
/*
 setIn
public static void setIn(InputStream in)���·��䡰��׼���������� 
���ȣ�����а�ȫ����������ͨ�� RuntimePermission("setIO") Ȩ�޵����� checkPermission �������鿴�Ƿ�������·��䡰��׼���������� 



������
in - �µı�׼������� System.in 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPermission �������������·����׼��������
�����°汾��ʼ�� 
JDK1.1 
����μ���
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

setOut
public static void setOut(PrintStream out)���·��䡰��׼��������� 
���ȣ�����а�ȫ����������ͨ�� RuntimePermission("setIO") Ȩ�޵����� checkPermission �������鿴�Ƿ�������·��䡰��׼��������� 


������
out - �µı�׼����� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPermission �������������·����׼�������
�����°汾��ʼ�� 
JDK1.1 
����μ���
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

setErr
public static void setErr(PrintStream err)���·��䡰��׼������������� 
���ȣ�����а�ȫ����������ͨ�� RuntimePermission("setIO") Ȩ�޵����� checkPermission �������鿴�Ƿ�������·��䡰��׼��������� 


������
err - �µı�׼��������� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPermission �������������·����׼�����������
�����°汾��ʼ�� 
JDK1.1 
����μ���
SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

inheritedChannel
public static Channel inheritedChannel()
                                throws IOException���شӴ����� Java �������ʵ���м̳е��ŵ��� 
�˷�������ͨ������ϵͳ��Ĭ�� SelectorProvider ����� inheritedChannel ������õ��ŵ��� 

���� inheritedChannel ������������������ŵ�֮�⣬�˷����Ժ󻹿��ܷ�������������ŵ��� 


���أ�
�̳е��ŵ�������У������򷵻� null�� 
�׳��� 
IOException - ������� I/O ���� 
SecurityException - �����ȫ���������ڲ���������������ŵ���
�����°汾��ʼ�� 
1.5 

--------------------------------------------------------------------------------

setSecurityManager
public static void setSecurityManager(SecurityManager s)����ϵͳ��ȫ�ԡ� 
����Ѿ���װ�˰�ȫ����������˷�������ͨ�� RuntimePermission("setSecurityManager") Ȩ�޵��ð�ȫ�������� checkPermission ��������ȷ�������滻���еİ�ȫ������������ܵ����׳�һ�� SecurityException �쳣�� 

���򣬽��ò�����Ϊ��ǰ��ȫ�������������������Ϊ null ����û�н�����ȫ����������ִ���κβ��������Ҹ÷��������з��ء� 


������
s - ��ȫ�������� 
�׳��� 
SecurityException - �����ȫ�������Ѿ����ò����� checkPermission �����������滻�����á�
����μ���
getSecurityManager(), SecurityManager.checkPermission(java.security.Permission), RuntimePermission

--------------------------------------------------------------------------------

getSecurityManager
public static SecurityManager getSecurityManager()���ϵͳ��ȫ�ӿڡ� 

���أ�
����Ѿ�Ϊ��ǰӦ�ó������˰�ȫ���������򷵻ش˰�ȫ�����������򣬷��� null��
����μ���
setSecurityManager(java.lang.SecurityManager)

--------------------------------------------------------------------------------

currentTimeMillis
public static long currentTimeMillis()�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣ע�⣬������ֵ��ʱ�䵥λ�Ǻ���ʱ��ֵ������ȡ���ڻ�������ϵͳ���������ȿ��ܸ������磬������ϵͳ�Լ�ʮ����Ϊ��λ����ʱ�䡣 
����� Date ����������˽���ܷ����ڡ������ʱ�䡱��Э������ʱ��UTC��֮���ϸ΢��������ۡ� 


���أ�
��ǰʱ����Э������ʱ 1970 �� 1 �� 1 ����ҹ֮���ʱ���Ժ���Ϊ��λ��������
����μ���
Date

--------------------------------------------------------------------------------

nanoTime
public static long nanoTime()������׼ȷ�Ŀ���ϵͳ��ʱ���ĵ�ǰֵ���Ժ�΢��Ϊ��λ�� 
�˷���ֻ�����ڲ����ѹ���ʱ�䣬��ϵͳ���ӱ�ʱ��������κ�ʱ������޹ء�����ֵ��ʾ��ĳһ�̶��������ʱ������ĺ�΢������������Ժ��������Ը�ֵ����Ϊ�������˷����ṩ��΢��ľ��ȣ������Ǳ�Ҫ�ĺ�΢���׼ȷ�ȡ�������ֵ�ĸ���Ƶ��û��������֤����ȡֵ��Χ����Լ 292 �꣨263 ��΢�룩���������õĲ�ͬ�����ڣ�����������������޷�׼ȷ�����ѹ���ʱ�䡣 

���磬����ĳЩ����ִ�е�ʱ�䳤�ȣ� 

   long startTime = System.nanoTime();
   // ... the code being measured ...
   long estimatedTime = System.nanoTime() - startTime;
 
���أ�
ϵͳ��ʱ���ĵ�ǰֵ���Ժ�΢��Ϊ��λ��
�����°汾��ʼ�� 
1.5 

--------------------------------------------------------------------------------

arraycopy
public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý������� src ���õ�Դ���鵽 dest ���õ�Ŀ�����飬���������һ�������б����������������Ƶ�����ı�ŵ��� length ������Դ������λ���� srcPos �� srcPos+length-1 ֮���������ֱ��Ƶ�Ŀ�������е� destPos �� destPos+length-1 λ�á� 
������� src �� dest ������ͬ������������Ƶ�ִ�й��̾ͺ������Ƚ� srcPos �� srcPos+length-1 λ�õ�������Ƶ�һ������ length �������ʱ���飬Ȼ���ٽ�����ʱ��������ݸ��Ƶ�Ŀ������� destPos �� destPos+length-1 λ��һ���� 

If ��� dest Ϊ null�����׳� NullPointerException �쳣�� 

��� src Ϊ null, ���׳� NullPointerException �쳣�����Ҳ����޸�Ŀ�����顣 

����ֻҪ�����κ����Ϊ�棬���׳� ArrayStoreException �쳣���Ҳ����޸�Ŀ�����飺 

src ����ָ���Ƿ�������� 
dest ����ָ���Ƿ�������� 
src ������ dest ����ָ������Щ���������Ϊ��ͬ�������͵����顣 
src ����ָ���Ǿ��л���������͵������� dest ����ָ���Ǿ�������������͵����顣 
src ����ָ���Ǿ�������������͵������� dest ����ָ���Ǿ��л���������͵����顣 
����ֻҪ�����κ����Ϊ�棬���׳� IndexOutOfBoundsException �쳣�����Ҳ����޸�Ŀ�����飺 

srcPos ����Ϊ���� 
destPos ����Ϊ���� 
length ����Ϊ���� 
srcPos+length ���� src.length����Դ����ĳ��ȡ� 
destPos+length ���� dest.length����Ŀ������ĳ��ȡ� 
�������Դ������ srcPos �� srcPos+length-1 λ���ϵ�ʵ�����ͨ������ת��������ת����Ŀ�������������ͣ����׳� ArrayStoreException �쳣������������£��� k ����Ϊ�ȳ���С����С�Ǹ��������������޷��� src[srcPos+k] ת��ΪĿ�������������ͣ����׳��쳣ʱ���� srcPos �� srcPos+k-1 λ���ϵ�Դ��������Ѿ������Ƶ�Ŀ�������е� destPos �� destPos+k-1 λ�ã���Ŀ�������е�����λ�ò��ᱻ�޸ġ�����Ϊ�Ѿ���ϸ˵��������Щ���ƣ�ֻ�ܽ��˶�����Ч��Ӧ�����������鶼���������͵�������͵�������� 


������
src - Դ���顣
srcPos - Դ�����е���ʼλ�á�
dest - Ŀ�����顣
destPos - Ŀ�������е���ʼλ�á�
length - Ҫ���Ƶ�����Ԫ�ص������� 
�׳��� 
IndexOutOfBoundsException - ������ƻᵼ�¶����鷶Χ��������ݵķ��ʡ� 
ArrayStoreException - �����Ϊ���Ͳ�ƥ���ʹ���޷��� src �����е�Ԫ�ش洢�� dest �����С� 
NullPointerException - ��� src �� dest Ϊ null��

--------------------------------------------------------------------------------

identityHashCode
public static int identityHashCode(Object x)���ظ�������Ĺ�ϣ�룬�ô�����Ĭ�ϵķ��� hashCode() ���صĴ���һ�������۸�����������Ƿ���д hashCode()��null ���õĹ�ϣ��Ϊ�㡣 

������
x - Ҫ�������ϣ��Ķ��� 
���أ�
��ϣ��
�����°汾��ʼ�� 
JDK1.1 

--------------------------------------------------------------------------------

getProperties
public static Properties getProperties()ȷ����ǰ��ϵͳ���ԡ� 
���ȣ�����а�ȫ���������򲻴�����ֱ�ӵ����� checkPropertiesAccess ����������ܵ���һ����ȫ���쳣�� 

�� getProperty(String) ����ʹ�õĵ�ǰϵͳ���Լ�����Ϊ Properties ���󷵻ء����û�е�ǰϵͳ���Լ��ϣ����ȴ�������ʼ��һ��ϵͳ���Լ��ϡ����ϵͳ���Լ������ǰ������¼���ֵ�� �� ���ֵ������ 
java.version Java ����ʱ�����汾 
java.vendor Java ����ʱ������Ӧ�� 
java.vendor.url Java ��Ӧ�̵� URL 
java.home Java ��װĿ¼ 
java.vm.specification.version Java ������淶�汾 
java.vm.specification.vendor Java ������淶��Ӧ�� 
java.vm.specification.name Java ������淶���� 
java.vm.version Java �����ʵ�ְ汾 
java.vm.vendor Java �����ʵ�ֹ�Ӧ�� 
java.vm.name Java �����ʵ������ 
java.specification.version Java ����ʱ�����淶�汾 
java.specification.vendor Java ����ʱ�����淶��Ӧ�� 
java.specification.name Java ����ʱ�����淶���� 
java.class.version Java ���ʽ�汾�� 
java.class.path Java ��·�� 
java.library.path ���ؿ�ʱ������·���б� 
java.io.tmpdir Ĭ�ϵ���ʱ�ļ�·�� 
java.compiler Ҫʹ�õ� JIT ������������ 
java.ext.dirs һ��������չĿ¼��·�� 
os.name ����ϵͳ������ 
os.arch ����ϵͳ�ļܹ� 
os.version ����ϵͳ�İ汾 
file.separator �ļ��ָ������� UNIX ϵͳ���ǡ�/���� 
path.separator ·���ָ������� UNIX ϵͳ���ǡ�:���� 
line.separator �зָ������� UNIX ϵͳ���ǡ�/n���� 
user.name �û����˻����� 
user.home �û�����Ŀ¼ 
user.dir �û��ĵ�ǰ����Ŀ¼ 


ϵͳ����ֵ�еĶ��·������ƽ̨��·���ָ����ָ��ġ� 

ע�⣬��ʹ��ȫ������������ִ�� getProperties ������������Ҳ��ѡ������ִ�� getProperty(String) ������ 


���أ�
ϵͳ���� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPropertiesAccess �������������ϵͳ���ԡ�
����μ���
setProperties(java.util.Properties), SecurityException, SecurityManager.checkPropertiesAccess(), Properties

--------------------------------------------------------------------------------

setProperties
public static void setProperties(Properties props)��ϵͳ��������Ϊ Properties ������ 
���ȣ�����а�ȫ���������򲻴�����ֱ�ӵ����� checkPropertiesAccess ����������ܵ���һ����ȫ���쳣�� 

������ getProperty(String) ����ʹ�õĵ�ǰϵͳ���Եļ��ϡ��������Ϊ null������Ե�ǰϵͳ���Եļ��ϡ� 


������
props - �µ�ϵͳ���ԡ� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPropertiesAccess �������������ϵͳ���ԡ�
����μ���
getProperties(), Properties, SecurityException, SecurityManager.checkPropertiesAccess()

--------------------------------------------------------------------------------

getProperty
public static String getProperty(String key)���ָ����ָʾ��ϵͳ���ԡ� 
���ȣ�����а�ȫ�����������øü���Ϊ����������� checkPropertyAccess ������������ܵ��� SecurityException�� 

���û�е�ǰϵͳ���Եļ��ϣ����������� getProperties ������ͬ�ķ�ʽ��������ʼ��ϵͳ���Եļ��ϡ� 


������
key - ϵͳ���Ե����ơ� 
���أ�
ϵͳ���Ե��ַ���ֵ�����û�д��д˼������ԣ��򷵻� null�� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPropertyAccess �������������ָ����ϵͳ���ԡ� 
NullPointerException - ��� key Ϊ null�� 
IllegalArgumentException - ��� key Ϊ�ա�
����μ���
setProperty(java.lang.String, java.lang.String), SecurityException, SecurityManager.checkPropertyAccess(java.lang.String), getProperties()

--------------------------------------------------------------------------------

getProperty
public static String getProperty(String key,
                                 String def)�����ָ����������ϵͳ���ԡ� 
���ȣ�����а�ȫ�����������ø� key ��Ϊ�������� checkPropertyAccess ������ 

���û�е�ǰϵͳ���Եļ��ϣ������� getProperties ������ͬ�ķ�ʽ���ȴ�������ʼ��ϵͳ���Եļ��ϡ� 


������
key - ϵͳ���Ե����ơ�
def - Ĭ��ֵ�� 
���أ�
ϵͳ���Ե��ַ���ֵ�����û�д��д˼������ԣ��򷵻�Ĭ��ֵ�� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPropertyAccess �������������ָ����ϵͳ���ԡ� 
NullPointerException - ��� key Ϊ null�� 
IllegalArgumentException - ��� key Ϊ�ա�
����μ���
setProperty(java.lang.String, java.lang.String), SecurityManager.checkPropertyAccess(java.lang.String), getProperties()

--------------------------------------------------------------------------------

setProperty
public static String setProperty(String key,
                                 String value)����ָ����ָʾ��ϵͳ���ԡ� 
���ȣ������ȫ���������ڣ���ͨ�� PropertyPermission(key, "write") Ȩ�޵����� SecurityManager.checkPermission ����������ܵ����׳� SecurityException�����û���׳��쳣����ָ����������Ϊ����ֵ�� 



������
key - ϵͳ���Ե����ơ�
value - ϵͳ���Ե�ֵ�� 
���أ�
ϵͳ������ǰ��ֵ�����û����ǰ��ֵ���򷵻� null�� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPermission ��������������ָ�����ԡ� 
NullPointerException - ��� key �� value Ϊ null�� 
IllegalArgumentException - ��� key Ϊ�ա�
�����°汾��ʼ�� 
1.2 
����μ���
getProperty(java.lang.String), getProperty(java.lang.String), getProperty(java.lang.String, java.lang.String), PropertyPermission, SecurityManager.checkPermission(java.security.Permission)

--------------------------------------------------------------------------------

clearProperty
public static String clearProperty(String key)�Ƴ�ָ����ָʾ��ϵͳ���ԡ� 
���ȣ������ȫ���������ڣ���ͨ�� PropertyPermission(key, "write") Ȩ�޵����� SecurityManager.checkPermission ����������ܵ����׳� SecurityException�����û���׳��쳣�����Ƴ�ָ�������ԡ� 



������
key - Ҫ�Ƴ���ϵͳ���Ե����ơ� 
���أ�
ϵͳ������ǰ���ַ���ֵ��������д˼������Բ����ڣ��򷵻� null�� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPropertyAccess �������������ָ����ϵͳ���ԡ� 
NullPointerException - ��� key Ϊ null�� 
IllegalArgumentException - ��� key Ϊ�ա�
�����°汾��ʼ�� 
1.5 
����μ���
getProperty(java.lang.String), setProperty(java.lang.String, java.lang.String), Properties, SecurityException, SecurityManager.checkPropertiesAccess()

--------------------------------------------------------------------------------

getenv
public static String getenv(String name)���ָ���Ļ�������ֵ������������һ��ȡ����ϵͳ���ⲿ������ֵ�� 
�����ȫ���������ڣ���ͨ�� RuntimePermission("getenv."+name) ��Ȩ�޵����� checkPermission ����������ܵ����׳� SecurityException�����û���׳��쳣���򷵻ر��� name ��ֵ�� 

�Ӹ����Ͻ���ϵͳ���� �ͻ������� ����������ֵ֮���ӳ�䡣���ֻ��ƶ����������û��������Ϣ���ݸ� Java ���̡������������������ȫ��ЧӦ����Ϊ���ǲ����Խ����ų��ֵ� Java �ӽ��̿ɼ������Ҷ��ڶ������ǵĽ��̵������ӽ��̶��ǿɼ��ġ��ڲ�ͬ�Ĳ���ϵͳ�ϣ����ǵ�������ϸ΢�Ĳ�𣬱��磬�����ִ�Сд����Ϊ��Щԭ�򣬻������������������ϲ����ĸ����á�����ڿ��ܵĵط�ʹ��ϵͳ���ԡ���������Ӧ������Ҫȫ��ЧӦ��ʱ��ʹ�ã��������ⲿϵͳ�ӿ�Ҫ��ʹ�û�������ʱʹ�ã����� PATH���� 

�� UNIX ϵͳ�У�name ����ĸ��Сдͨ������Ҫ������ Microsoft Windows ϵͳ�У���ͨ������Ҫ�����磬���ʽ System.getenv("FOO").equals(System.getenv("foo")) �� Microsoft Windows �п���Ϊ�档 


������
name - �������������� 
���أ�
�������ַ���ֵ���������������ϵͳ�����ж���ģ��򷵻� null 
�׳��� 
NullPointerException - ��� name Ϊ null 
SecurityException - �����ȫ���������ڲ����� checkPermission ������������ʻ������� name
����μ���
getenv(), ProcessBuilder.environment()

--------------------------------------------------------------------------------

getenv
public static Map<String,String> getenv()����һ�������޸ĵĵ�ǰϵͳ�������ַ���ӳ����ͼ���û�����һ��ȡ����ϵͳ�Ĵ����Ƶ�ֵ��ӳ�䣬���Ӹ����̴��ݸ��ӽ��̡� 
���ϵͳ��֧�ֻ����������򷵻�һ����ӳ�䡣 

���ص�ӳ����Զ������� null ���� Null ֵ�������ͼ��ѯ null ���� Null ֵ�Ĵ��ڣ�����׳� NullPointerException�������ͼ��ѯ���� String ���͵ļ���ֵ�Ĵ��ڣ�����׳� ClassCastException�� 

���ص�ӳ�估�伯����ͼ����û������ Object.equals(java.lang.Object) �� Object.hashCode() ������ͨ��Э���� 

�����е�ƽ̨�ϣ����ص�ӳ��ͨ���������ִ�Сд�ġ� 

�����ȫ���������ڣ���ͨ�� RuntimePermission("getenv.*") Ȩ�޵��� checkPermission ����������ܵ����׳� SecurityException�� 

����Ϣ���ݸ� Java �ӽ���ʱ��ϵͳ����һ�������ڻ��������� 


���أ�
��Ϊ�������Ƶ�ֵ��ӳ��Ļ��� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkPermission ������������ʽ��̻���
�����°汾��ʼ�� 
1.5 
����μ���
getenv(String), ProcessBuilder.environment()

--------------------------------------------------------------------------------

exit
public static void exit(int status)��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ����������״̬���ʾ�쳣��ֹ�� 
�÷������� Runtime ���е� exit �������÷�����Զ�����������ء� 

���� System.exit(n) ʵ���ϵ�Ч�ڵ��ã� 

 Runtime.getRuntime().exit(n)
 
������
status - �˳�״̬�� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkExit ������������ָ��״̬�˳���
����μ���
Runtime.exit(int)

--------------------------------------------------------------------------------

gc
public static void gc()���������������� 
���� gc ������ʾ�� Java ���������һЩŬ��������δ�ö����Ա��ܹ����ٵ�������Щ����ǰռ�õ��ڴ档������Ȩ�ӷ��������з���ʱ��������Ѿ������Ŭ�������ж����Ķ����л����˿ռ䡣 

���� System.gc() ʵ���ϵ�Ч�ڵ��ã� 

 Runtime.getRuntime().gc()
 
����μ���
Runtime.gc()

--------------------------------------------------------------------------------

runFinalization
public static void runFinalization()���д��ڹ�����ֹ״̬�����ж������ֹ������ 
���ø÷���˵�� Java ���������һЩŬ�������ѱ���������� finalize ������������Щ����� finalize ����������δ���С�������Ȩ�ӷ��������з���ʱ��Java ������Ѿ������Ŭ��ȥ�������δִ�е���ֹ������ 

���� System.runFinalization() ʵ���ϵ�Ч�ڵ��ã� 

 Runtime.getRuntime().runFinalization()
 
����μ���
Runtime.runFinalization()

--------------------------------------------------------------------------------

runFinalizersOnExit
@Deprecated
public static void runFinalizersOnExit(boolean value)�ѹ�ʱ�� �÷������й��еĲ���ȫ�ԡ������ܶ�����ʹ�õĶ�������ս᷽�����������߳�ͬʱ���ڲ�����Щ���󣬴Ӷ����²���ȷ����Ϊ�������� 

���˳�ʱ���û�����ս᣻��������ָ����ӵ��δ���Զ������ս᷽�������ж�����ս᷽�����˳� Java ���п�ǰ���С�Ĭ������£������˳�ʱ�սᡣ 
����а�ȫ��������������ʹ�� 0 ��Ϊ������������ checkExit ��������ȷ�������˳�������ܵ����׳� SecurityException�� 


������
value - ָʾ���û������ֹ������ֵ 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkExit �����������˳���
�����°汾��ʼ�� 
JDK1.1 
����μ���
Runtime.exit(int), Runtime.gc(), SecurityManager.checkExit(int)

--------------------------------------------------------------------------------

load
public static void load(String filename)����Ϊ��̬��ı����ļ�ϵͳ����ָ�����ļ������ش����ļ����ļ�������������������·������ 
���� System.load(name) ʵ���ϵ�Ч�ڵ��ã� 

 Runtime.getRuntime().load(name)
 
������
filename - Ҫ���ص��ļ��� 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkLink �������������ָ���Ķ�̬�⡣ 
UnsatisfiedLinkError - ����ļ������ڡ� 
NullPointerException - ��� filename Ϊ null
����μ���
Runtime.load(java.lang.String), SecurityManager.checkLink(java.lang.String)

--------------------------------------------------------------------------------

loadLibrary
public static void loadLibrary(String libname)������ libname ����ָ����ϵͳ�⡣������ӳ�䵽ʵ��ϵͳ��ķ���ȡ����ϵͳ�� 
���� System.loadLibrary(name) ʵ���ϵ�Ч�ڵ��ã� 

 Runtime.getRuntime().loadLibrary(name)
 
������
libname - ������ 
�׳��� 
SecurityException - �����ȫ���������ڲ����� checkLink �������������ָ���Ķ�̬�⡣ 
UnsatisfiedLinkError - ����ⲻ���ڡ� 
NullPointerException - ��� libname Ϊ null
����μ���
Runtime.loadLibrary(java.lang.String), SecurityException, SecurityManager.checkLink(java.lang.String)

--------------------------------------------------------------------------------

mapLibraryName
public static String mapLibraryName(String libname)��һ��������ӳ�䵽�ض���ƽ̨�ġ���ʾ��������ַ����С� 

������
libname - ������ 
���أ�
ȡ����ƽ̨�ı��������ơ� 
�׳��� 
NullPointerException - ��� libname Ϊ null��
�����°汾��ʼ�� 
1.2 
����μ���
loadLibrary(java.lang.String), ClassLoader.findLibrary(java.lang.String)
 * */

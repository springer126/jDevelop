package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//�����ɫ--����һ���ӿ�
interface Subject  {
	abstract public void request();
}

//����ʵ��Subject�Ľ�ɫ
class RealSubject implements Subject{
	public RealSubject(){}
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("From Real Subject.");
	}
}

//��������
class DynamicSubject implements InvocationHandler{
	private Object sub;
	public DynamicSubject(Object obj) {
		// TODO Auto-generated constructor stub
		sub=obj;
	}
	
	public Object invoke(Object obj,Method method,Object args[]) throws Throwable {
		System.out.println("before calling " + method);
	    method.invoke(sub,args);
	    //invoke(Object obj,Method method, Object[] args)����ʵ��ʹ��ʱ����һ������objһ����ָ�����࣬
	    //method�Ǳ�����ķ������������е�request()��argsΪ�÷����Ĳ������顣 ������󷽷��ڴ������ж�̬ʵ��

		System.out.println("after calling " + method);
		return null;

	}
}

public class DynamicProxyTest {
	public static void main(String[] args) throws Throwable {
		RealSubject rs = new RealSubject(); //������ָ���������� 
		InvocationHandler ds = new DynamicSubject(rs); 
		Class<?> cls = rs.getClass(); 
		   //������һ�������ɴ���
		/*
		 ���༴Ϊ��̬�����࣬���������������е�ProxySubject��������Ҫ�����������ݣ� 
		Protected Proxy(InvocationHandler h)�����캯�����������ڸ��ڲ���h��ֵ�� 
		Static Class getProxyClass (ClassLoader loader, Class[] interfaces)��
		���һ�������࣬����loader����װ������interfaces����ʵ����ӵ�е�ȫ���ӿڵ����顣 
		Static Object newProxyInstance(ClassLoader loader, Class[] interfaces, 
		InvocationHandler h)�����ش������һ��ʵ�������غ�Ĵ�������Ե�����������ʹ��
		(��ʹ�ñ����������Subject�ӿ����������ķ���)�� 
		��νDynamic Proxy������һ��class������������ʱ���ɵ�class��
		��������ʱ������ṩһ��interface������Ȼ���class��������ʵ������Щ interface��
		�㵱Ȼ���԰Ѹ�class��ʵ��������Щinterface�е��κ�һ�����á�
		��Ȼ�������Dynamic Proxy��ʵ����һ��Proxy��������������ʵ���ԵĹ�����
		����������ʵ��ʱ������ṩһ��handler�������ӹ�ʵ�ʵĹ���
		*/
		Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),ds ); 
		subject.request(); 



	}

}

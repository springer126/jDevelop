package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicInvocationHandler implements InvocationHandler{
	private Object proxied;
	public DynamicInvocationHandler(Object proxied) {
		this.proxied=proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("proxy:"+proxy.getClass()+
				"\nmethod:"+method+"\nargs:"+args);
		if(args!=null)
			for(Object arg :args){
				System.out.println("arg:"+arg);
			}
		
		return method.invoke(proxied, args);
	}	
}

public class SimpleDynamicProxy {
	public static void consume(Interface iface){
		iface.doSomething();
		iface.somethingElse("bomnono");
	}
	
	public static void main(String[] args) {
		RealObjects realObject = new RealObjects();
		consume(realObject);
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[]{Interface.class},
				new DynamicInvocationHandler(realObject));
		consume(proxy);
	}

}

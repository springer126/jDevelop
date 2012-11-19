package DynamicProxy;

/*
 定义接口
 */
interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObjects implements Interface{
	public void doSomething() {
		System.out.println("------doSomething()-----");
	}
	public void somethingElse(String arg) {
		System.out.println("--------somethingElse()"+arg+"---------");
	}
}

class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied=proxied;
	}
	public void doSomething() {
		System.out.println("------SimpleProxy.doSomething()-----");
		proxied.doSomething();
	}
	public void somethingElse(String arg) {
		System.out.println("--------SimpleProxy.somethingElse()"+arg+"---------");
		proxied.somethingElse(arg);
	}
}

public class SimpleProxyDemo {

	/**
	 * @param args
	 */
	public static void consume(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonono");
	}
	
	public static void main(String[] args) {
		consume(new RealObjects());
		consume(new SimpleProxy(new RealObjects()));

	}

}

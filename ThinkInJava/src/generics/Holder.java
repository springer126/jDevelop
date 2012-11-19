package generics;

public class Holder<T>{
	private T a;
	public Holder(T a) {
		this.a=a;
	}
	
	public void set(T a){
		this.a=a;
	}
	
	public T get(){return a;}
	
	
	public static void main(String[] args) {
		Holder<Fruits> h1= new Holder<Fruits>(new Fruits());
		Holder<Fruits> h2= new Holder<Fruits>(new Apple());
		Holder<Fruits> h3= new Holder<Fruits>(new Banana());
		
	}

}

class Fruits{}
class Apple extends Fruits{};
class Banana extends Fruits{};
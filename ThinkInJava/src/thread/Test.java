package thread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable1 r= new Runnable1();
		Thread thread1 = new Thread(r);
		Thread thread2 = new Thread(r);
		thread1.setName("线程1");
		thread2.setName("线程2");
		//thread1.setPriority(1);
		//thread2.setPriority(4);
		thread1.start();
		thread2.start();
		
		for(int i=0;i<100;i++){
			String name = Thread.currentThread().getName();
			System.out.println(name+": "+i);
				
		}
		

	}

}

class Runnable1 implements Runnable{
	public void run() {
		for(int i=0;i<50;i++){
			String name = Thread.currentThread().getName();
			System.out.println(name+": "+i);
				
		}
		
	}
}
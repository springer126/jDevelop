package thread;

public class TestPriority {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("线程名\t优先级");
		Thread current = Thread.currentThread();
		System.out.print(current.getName()+"\t");
		System.out.println(current.getPriority());
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		Thread2 t3 = new Thread2();
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
	}

}

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.print(this.getName()+"\t");
		System.out.println(this.getPriority());
		
	}
}

/**
 * 
线程名	优先级
main	5
Second	10
Third	8
First	5
*/

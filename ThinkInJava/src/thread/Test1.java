package thread;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread1 t1 = new Thread1(10);
		t1.setName("用户线程1");
		t1.start();
		
		Thread1 t2 = new Thread1(100);
		t2.setDaemon(true);//该线程后台运行 （CPU空闲时运行）
		t2.setName("用户线程2");
		t2.start();
		
		for (int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		System.out.println("主线程: 结束");
	
		

	}

}

class Thread1 extends Thread{
	private int n;
	public Thread1(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for (int i=0;i<n;i++){
			System.out.println(this.getName()+": "+i);
		}
		System.out.println(this.getName()+": 结束");
	}
};

/*后台线程提前终止？？thread1 与main线程退出时 后台线程退出【后太线程是服务性质的，用户线程退出时，后台线程也退出】
main: 0
main: 1
main: 2
main: 3
main: 4
main: 5
main: 6
main: 7
main: 8
main: 9
主线程: 结束
用户线程1: 0
用户线程1: 1
用户线程1: 2
用户线程1: 3
用户线程1: 4
用户线程1: 5
用户线程1: 6
用户线程1: 7
用户线程1: 8
用户线程1: 9
用户线程1: 结束
用户线程2: 0
用户线程2: 1
用户线程2: 2
用户线程2: 3
用户线程2: 4
用户线程2: 5
用户线程2: 6
用户线程2: 7
用户线程2: 8
用户线程2: 9
用户线程2: 10
用户线程2: 11
用户线程2: 12
用户线程2: 13
用户线程2: 14
用户线程2: 15
用户线程2: 16
用户线程2: 17
*/
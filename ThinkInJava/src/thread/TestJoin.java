package thread;

public class TestJoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRuner mr = new MyRuner();
		Thread t = new Thread(mr);
		t.start();
		
		try{
			t.join(1);//重载join()方法 参数毫秒 纳秒【不可靠，不常用】
		}catch(InterruptedException e){//注意Interrupt  
			System.out.println(e.getMessage());
		}
		
		for(int i=0;i<50;i++){
			System.out.println("主线程 :"+i);
		}

	}

}


class  MyRuner extends  Thread {
	@Override
	public void run() {
		for (int i=0;i<20;i++){
			System.out.println("SubThread :"+i);
		}
	}
}

/**
 
 线程的join()方法可以实现线程之间的串行执行，调用该方法的Thread必须执行完【例如一个线程等待一个线程的结果】
SubThread :0
SubThread :1
SubThread :2
SubThread :3
SubThread :4
SubThread :5
SubThread :6
SubThread :7
SubThread :8
SubThread :9
SubThread :10
SubThread :11
SubThread :12
SubThread :13
SubThread :14
SubThread :15
SubThread :16
SubThread :17
SubThread :18
SubThread :19
SubThread :20
SubThread :21
SubThread :22
SubThread :23
SubThread :24
SubThread :25
SubThread :26
SubThread :27
SubThread :28
SubThread :29
SubThread :30
SubThread :31
SubThread :32
SubThread :33
SubThread :34
SubThread :35
SubThread :36
SubThread :37
SubThread :38
SubThread :39
SubThread :40
SubThread :41
SubThread :42
SubThread :43
SubThread :44
SubThread :45
SubThread :46
SubThread :47
SubThread :48
SubThread :49
主线程 :0
主线程 :1
主线程 :2
主线程 :3
主线程 :4
主线程 :5
主线程 :6
主线程 :7
主线程 :8
主线程 :9
主线程 :10
主线程 :11
主线程 :12
主线程 :13
主线程 :14
主线程 :15
主线程 :16
主线程 :17
主线程 :18
主线程 :19
主线程 :20
主线程 :21
主线程 :22
主线程 :23
主线程 :24
主线程 :25
主线程 :26
主线程 :27
主线程 :28
主线程 :29
主线程 :30
主线程 :31
主线程 :32
主线程 :33
主线程 :34
主线程 :35
主线程 :36
主线程 :37
主线程 :38
主线程 :39
主线程 :40
主线程 :41
主线程 :42
主线程 :43
主线程 :44
主线程 :45
主线程 :46
主线程 :47
主线程 :48
主线程 :49

主线程 :0
主线程 :1
主线程 :2
主线程 :3
主线程 :4
主线程 :5
主线程 :6
主线程 :7
主线程 :8
主线程 :9
主线程 :10
主线程 :11
主线程 :12
主线程 :13
主线程 :14
主线程 :15
主线程 :16
主线程 :17
主线程 :18
主线程 :19
主线程 :20
主线程 :21
主线程 :22
主线程 :23
主线程 :24
主线程 :25
主线程 :26
主线程 :27
主线程 :28
主线程 :29
主线程 :30
主线程 :31
主线程 :32
主线程 :33
主线程 :34
主线程 :35
主线程 :36
主线程 :37
主线程 :38
主线程 :39
主线程 :40
主线程 :41
主线程 :42
主线程 :43
SubThread :0
SubThread :1
SubThread :2
SubThread :3
SubThread :4
SubThread :5
SubThread :6
SubThread :7
SubThread :8
SubThread :9
SubThread :10
SubThread :11
SubThread :12
SubThread :13
SubThread :14
SubThread :15
SubThread :16
SubThread :17
SubThread :18
SubThread :19
主线程 :44
主线程 :45
主线程 :46
主线程 :47
主线程 :48
主线程 :49

 */


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
			t.join(1);//����join()���� �������� ���롾���ɿ��������á�
		}catch(InterruptedException e){//ע��Interrupt  
			System.out.println(e.getMessage());
		}
		
		for(int i=0;i<50;i++){
			System.out.println("���߳� :"+i);
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
 
 �̵߳�join()��������ʵ���߳�֮��Ĵ���ִ�У����ø÷�����Thread����ִ���꡾����һ���̵߳ȴ�һ���̵߳Ľ����
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
���߳� :0
���߳� :1
���߳� :2
���߳� :3
���߳� :4
���߳� :5
���߳� :6
���߳� :7
���߳� :8
���߳� :9
���߳� :10
���߳� :11
���߳� :12
���߳� :13
���߳� :14
���߳� :15
���߳� :16
���߳� :17
���߳� :18
���߳� :19
���߳� :20
���߳� :21
���߳� :22
���߳� :23
���߳� :24
���߳� :25
���߳� :26
���߳� :27
���߳� :28
���߳� :29
���߳� :30
���߳� :31
���߳� :32
���߳� :33
���߳� :34
���߳� :35
���߳� :36
���߳� :37
���߳� :38
���߳� :39
���߳� :40
���߳� :41
���߳� :42
���߳� :43
���߳� :44
���߳� :45
���߳� :46
���߳� :47
���߳� :48
���߳� :49

���߳� :0
���߳� :1
���߳� :2
���߳� :3
���߳� :4
���߳� :5
���߳� :6
���߳� :7
���߳� :8
���߳� :9
���߳� :10
���߳� :11
���߳� :12
���߳� :13
���߳� :14
���߳� :15
���߳� :16
���߳� :17
���߳� :18
���߳� :19
���߳� :20
���߳� :21
���߳� :22
���߳� :23
���߳� :24
���߳� :25
���߳� :26
���߳� :27
���߳� :28
���߳� :29
���߳� :30
���߳� :31
���߳� :32
���߳� :33
���߳� :34
���߳� :35
���߳� :36
���߳� :37
���߳� :38
���߳� :39
���߳� :40
���߳� :41
���߳� :42
���߳� :43
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
���߳� :44
���߳� :45
���߳� :46
���߳� :47
���߳� :48
���߳� :49

 */


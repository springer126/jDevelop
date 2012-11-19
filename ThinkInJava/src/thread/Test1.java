package thread;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread1 t1 = new Thread1(10);
		t1.setName("�û��߳�1");
		t1.start();
		
		Thread1 t2 = new Thread1(100);
		t2.setDaemon(true);//���̺߳�̨���� ��CPU����ʱ���У�
		t2.setName("�û��߳�2");
		t2.start();
		
		for (int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		System.out.println("���߳�: ����");
	
		

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
		System.out.println(this.getName()+": ����");
	}
};

/*��̨�߳���ǰ��ֹ����thread1 ��main�߳��˳�ʱ ��̨�߳��˳�����̫�߳��Ƿ������ʵģ��û��߳��˳�ʱ����̨�߳�Ҳ�˳���
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
���߳�: ����
�û��߳�1: 0
�û��߳�1: 1
�û��߳�1: 2
�û��߳�1: 3
�û��߳�1: 4
�û��߳�1: 5
�û��߳�1: 6
�û��߳�1: 7
�û��߳�1: 8
�û��߳�1: 9
�û��߳�1: ����
�û��߳�2: 0
�û��߳�2: 1
�û��߳�2: 2
�û��߳�2: 3
�û��߳�2: 4
�û��߳�2: 5
�û��߳�2: 6
�û��߳�2: 7
�û��߳�2: 8
�û��߳�2: 9
�û��߳�2: 10
�û��߳�2: 11
�û��߳�2: 12
�û��߳�2: 13
�û��߳�2: 14
�û��߳�2: 15
�û��߳�2: 16
�û��߳�2: 17
*/
package thread;


public class SynStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		Thread t1 = new Thread(new Producer(s));
		Thread t2 = new Thread(new Consumer(s));
		t1.start();
		t2.start();

	}

}


class Stack{
	private char[] c = new char[6];
	private int index=0;
	
	public synchronized void push(char x){
		if(index==c.length)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.notify();
		/* Wakes up a single thread that is waiting on this 
		object's monitor. If any threads are waiting on this object, one 
		of them is chosen to be awakened. The choice is arbitrary and 
		occurs at the discretion of the implementation. A thread waits 
		on an object's monitor by calling one of the wait methods. 
		The awakened thread will not be able to proceed until the 
		current thread relinquishes the lock on this object. The
		awakened thread will compete in the usual manner with any
		other threads that might be actively competing to synchronize
		on this object; for example, the awakened thread enjoys no
		reliable privilege or disadvantage in being the next thread
		to lock this object. */


		
		
		c[index]=x;
		index++;
		System.out.println("������"+x);
	}
	
	public synchronized char pop(){
		if(index==0)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.notify();	
		index--;
	    char x = c[index];
		System.out.println("���ѣ�"+x);
		return x;
	}
 }
 
 class Producer implements Runnable{
	 Stack s;
	 public Producer(Stack s) {
		 this.s = s;
		// TODO Auto-generated constructor stub
	}
	 public void run() {
		// TODO Auto-generated method stub
		 for(int i = 0;i<20;i++){
			 char x = (char)(Math.random()*26+'A');
			 s.push(x);
			 try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
	}
 }
 
 class Consumer implements Runnable{
	 Stack s;
	 public Consumer(Stack s) {
		 this.s = s;
		// TODO Auto-generated constructor stub
	}
	 public void run() {
		// TODO Auto-generated method stub
		 for(int i=0;i<20;i++){
			 s.pop();
			 try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
	}
 }
 
 /*
  * ������D
���ѣ�D
������F
���ѣ�F
������I
���ѣ�I
������D
���ѣ�D
������E
���ѣ�E
������Q
���ѣ�Q
������A
���ѣ�A
������R
������B
���ѣ�B
������Q
������E
���ѣ�E
������B
���ѣ�B
������Q
������M
���ѣ�M
������A
������R
���ѣ�R
������O
������N
���ѣ�N
������J
���ѣ�J
������F
���ѣ�F
���ѣ�O
���ѣ�A
���ѣ�Q
���ѣ�Q
���ѣ�R
  */
 
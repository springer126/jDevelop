package thread;

class Singleton{
	private static Singleton sample;
	public Singleton() {
	 }
	
	public static synchronized Singleton getInstance(){
		if(sample==null){
			Thread.yield();
			sample = new Singleton();
			
		}
		return sample;
		
	}
	
	/*
	public static Singleton getInstance(){
		if(sample==null){
			sample = new Singleton();
		}
		return sample;
		
	}
	*/
}


class MyThread extends Thread{
	@Override
	public  void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());

	}
	
	public static void main(String[] args) {
	
		Thread[] threads = new Thread[5];

		for(int i=0;i<threads.length;i++)
			threads[i] = new MyThread();
		
		for(int i=0;i<threads.length;i++)
			threads[i].start();

	}
	
}


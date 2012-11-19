package net;


public class SocketTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Runtime.getRuntime().availableProcessors() );
		System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024) );
		//System.out.println(Runtime.getRuntime().maxMemory());
		//System.out.println(Runtime.getRuntime().freeMemory());
		int total = (int) Runtime.getRuntime().totalMemory();
		int free = (int) Runtime.getRuntime().freeMemory();
		int max = (int) Runtime.getRuntime().maxMemory();
		if(free+max==total)
			 System.out.println(1);
		
		/*
		for(int port=1;port<=65535;port++){ 
			   try{ 
			ServerSocket serverSocket=new ServerSocket(port); 
			serverSocket.close();           //及时关闭ServerSocket 
			  }catch(IOException e){ 
			    System.out.println("端口"+port+" 已经被其他服务器进程占用"); 
			} 
			}
 */
	}

}
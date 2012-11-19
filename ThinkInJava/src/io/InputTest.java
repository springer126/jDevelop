package io;


/**
 * 
 * @author Administrator wenhui
 * java中使用inputstream表示所有输入流的抽象概念
 *
 */
public class InputTest {
	public static void main(String[] args) {
		byte[] buf = new byte[10];
        String strInfo = null;
		int pos=0;
		int ch = 0;
		System.out.println("Please enter you sentence:");
		while(true){
			try{
				ch = System.in.read();
			}catch(Exception e){
				e.printStackTrace();
			}
			switch(ch){
			    case '\r':
			    	break;
			    case '\n':
			    	strInfo = new String(buf,0,pos);
			    	if(strInfo.equals("exit"))
			    		return;
			    	else{
			    		System.out.println(strInfo);
			    		pos = 0;
			    	}
			    	break;
			    default:
			    	buf[pos++] = (byte) ch;
			}
			
		}
		
	}

} 

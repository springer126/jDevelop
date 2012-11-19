package io;

import java.io.BufferedInputStream;

import java.io.IOException;

public class BufferedStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		
		byte[] buf = new byte[1024];
		BufferedInputStream bis = new BufferedInputStream(System.in);
		//int ch = bis.read(buf,0,bis.available());
		int ch = 0;
		while((ch=bis.read())!=-1){
			System.out.println(Integer.toString(ch));
			System.out.print((char)ch);
		}

		   /*
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("BufferedStreamTest.txt"));
      
		 for(int i=65;i<90;i++){
        	 out.write(i);
             out.flush();
         }
    
		 for(int i=65;i<91;i++){
        	 out.write(i);
        	 out.write(8);
        	 out.write('2');
             out.flush();
         }

         byte[] buf = new byte[1024];
    	 BufferedInputStream in = new BufferedInputStream(new FileInputStream("BufferedStreamTest.txt"));
    	 int len = in.read(buf);
    	 System.out.println(new String(buf,0,len));
		     */

	}

}


/*
 ABCDEFGHIJKLMNOPQRSTUVWXY


A2B2C2D2E2F2G2H2I2J2K2L2M2N2O2P2Q2R2S2T2U2V2W2X2Y2Z2
 */
 
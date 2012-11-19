package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class DataStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("DataStreamTest.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);	
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("ab�й�");
		dos.writeBytes("�й�");
		dos.writeChars("�й�");
		dos.close();
		
		FileInputStream fis = new FileInputStream("DataStreamTest.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);	
		DataInputStream dis = new DataInputStream(bis);
		
		System.out.println(dis.readUTF());
		byte[] buf = new byte[1024];
		int len = dis.read(buf);
		System.out.println(new String(buf,0,len));
		fis.close();

	}
	
	

}

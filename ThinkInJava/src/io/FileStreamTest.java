package io;

import java.io.*;

public class FileStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream out = new FileOutputStream("hello.txt");
			out.write("www.wenhui.com".getBytes());
			out.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			byte[] buf = new byte[1024];
		
		try {
			File f = new File("hello.txt");
			FileInputStream in = new FileInputStream(f);
			int len = in.read(buf);
			System.out.println(new String(buf,0,len));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

}

/*
 二进制与文本的区别：
 	文件以二进制的形式存在于内存
 	字节都可以转换成字符：文本文件
 	文本以外的文件称为：二进制文件
 */

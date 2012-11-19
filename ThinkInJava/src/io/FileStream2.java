package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileStream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter("hello2.txt");
		out.write("hello wenhui");//不用把字符串转换为字节
		out.close();
		char[] buf = new char[1024];
		FileReader in = new FileReader("hello2.txt");
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
	}

}

/*
 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	at java.lang.String.<init>(String.java:208)
	at io.FileStream2.main(FileStream2.java:19)

 */
 
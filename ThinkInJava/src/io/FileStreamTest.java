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
 ���������ı�������
 	�ļ��Զ����Ƶ���ʽ�������ڴ�
 	�ֽڶ�����ת�����ַ����ı��ļ�
 	�ı�������ļ���Ϊ���������ļ�
 */

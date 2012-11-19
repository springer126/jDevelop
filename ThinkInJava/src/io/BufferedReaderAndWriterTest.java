package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BufferedReaderAndWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"iso-8859-1"));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"gb2312"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
		String str = in.readLine();
		System.out.println(str);
		
		//FileOutputStream fs = new FileOutputStream("BufferedReaderAndWriterTest.txt");
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs));
		Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
		out.write("BufferedReaderAndWriterTest");
		out.flush();
		out.close();

	}

}
/*
 你好
????

你好
你好
 
 你好
???

 */

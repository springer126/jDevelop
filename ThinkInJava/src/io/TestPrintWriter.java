package io;

import java.io.*;

public class TestPrintWriter {
	
	public static void main(String[] args) {
		
		try{
			throw new Exception("test");
		}catch(Exception e){
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			System.out.println(sw.toString());
			System.out.println(e.getMessage());
			
		}
	}

}
/*
 java.lang.Exception: test
	at io.TestPrintWriter.main(TestPrintWriter.java:10)

test

 */
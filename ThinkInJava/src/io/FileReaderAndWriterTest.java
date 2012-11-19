package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(new File("FileReaderAndWriterTest.txt"));
		fw.write("FileReaderAndWriterTest.txt");
		fw.write("ÄãºÃ£¬ÖÐ¹ú");
		fw.close();
		
		char[] buf = new char[1024];
		FileReader fr = new FileReader("FileReaderAndWriterTest.txt");
		int len = fr.read(buf);
		System.out.println(new String(buf,0,len));

	}

}

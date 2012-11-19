package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("1.txt");
		if(file.exists()){
			file.delete();
		}else{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("file name:"+file.getName());
		System.out.println("file path:"+file.getPath());
		System.out.println("file absolute path:"+file.getAbsolutePath());
		System.out.println("file parent path:"+file.getParent());
		System.out.println(file.exists()?"exists":"no exists");
		System.out.println(file.canRead()?"read":"no read");
		System.out.println(file.isDirectory()?"Directory":"no Directory");
		System.out.println("file lastModified :"+new Date(file.lastModified()));
		
		
		//System.out.println("file :"+file.getName());
	}

}

package container;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;



public class TestProperties {

	/**
	 public class Propertiesextends Hashtable<Object,Object>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Properties settings = new Properties();
		try {
			settings.load(new FileInputStream("count.txt"));
		} catch (Exception e) {
			settings.setProperty("count", String.valueOf(0));
		} 
		int c = Integer.parseInt(settings.getProperty("count"))+1;
		System.out.println("这是程序的第"+c+"次运行");
		settings.setProperty("count", new Integer(c).toString());
		try {
			settings.store(new  FileOutputStream("count.txt"), "Program is used:");
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Total running time :"+(end-start));

	}

}

package test;

import java.io.IOException;
import java.lang.reflect.Method;


public class TestRunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Process p = null;
//		Runtime  rt = Runtime.getRuntime();
//		try {
//			p = Runtime.getRuntime().exec("notepad.exe TestSystem.java");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		p.destroy();

		Method[] m = Runtime.class.getMethods();
		for(int i=0;i<m.length;i++){
			System.out.println(m[i]);
		}
		try {
			Runtime.getRuntime().exec("hh.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

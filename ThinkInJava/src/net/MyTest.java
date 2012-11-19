package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			try {
				String strLine = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if(strLine!=null)
					System.out.println("hi:"+strLine);
				else
					return;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

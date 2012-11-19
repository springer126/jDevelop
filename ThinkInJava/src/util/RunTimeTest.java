package util;

import java.io.IOException;

public class RunTimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process p = Runtime.getRuntime().exec("notepad");
			Process p1 = Runtime.getRuntime().exec("regedit");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

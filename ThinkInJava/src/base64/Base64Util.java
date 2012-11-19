package base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.misc.BASE64Encoder;

public class Base64Util {
	public static void main(String[] args) {
		BASE64Encoder encoder = new BASE64Encoder();
		
		try {
			System.out.println("Please input your username:");
			String username = new BufferedReader(
					new InputStreamReader(System.in)).readLine();
			System.out.println(encoder.encode(username.getBytes()));
			System.out.println("Please input your password:");
			String passwd = new BufferedReader(
					new InputStreamReader(System.in)).readLine();
			System.out.println(encoder.encode(passwd.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

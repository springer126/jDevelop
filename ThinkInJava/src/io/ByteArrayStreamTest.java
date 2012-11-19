package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.InputStream;



public class ByteArrayStreamTest {

	/**
	 * @param args
	 */
	
	public static void transform(InputStream in,java.io.OutputStream out)  {
        int	ch = 0;
        try{
        while((ch=in.read())!=-1){
       // System.out.println(Integer.toString(ch));
		int upperCh = (int)Character.toUpperCase((char)ch);
		out.write(upperCh);
		//out.close();
		//System.out.println(Integer.toString(upperCh));
		}

		} catch(Exception e){
        	e.printStackTrace();
        }
        	
	}
	
	
	
	public static void main(String[] args) {
		String str = new String("abcdefghijklmnopqrstuvwxyz");
		byte[] src = str.getBytes();
		ByteArrayInputStream input = new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		transform(input, output);
		byte[] result = output.toByteArray();
		System.out.println(new String(result));
		transform(System.in,System.out);
	}

}

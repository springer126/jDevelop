package io;

import java.io.IOException;

public class CharDecode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.getProperties().put("file.encoding", "iso-8859-1");
		System.out.println("请输入中文字符串：");
		byte[] buf = new byte[1024];
		int pos = 0;
		String strInfo;
		while(true){
			int ch = System.in.read();
			System.out.println(Integer.toHexString(ch));
			switch(ch){
				case '\r':
					break;
				case '\n':
					strInfo = new String(buf,0,pos,"iso-8859-1");
					//strInfo = new String(buf,0,pos);
					for(int i=0;i<strInfo.length();i++){
						System.out.println(Integer.toHexString((int)strInfo.charAt(i)));
					}
					
					System.out.println(new String(strInfo.getBytes("ISO8859-1"),"gb2312"));
					
					System.out.println();
					break;
				default:
					buf[pos++] = (byte)ch;
					break;
			}
		}

	}

}

/*
请输入中文字符串：
中国
d6
d0
b9
fa
d
a
d6
d0
b9
fa
中国

*/

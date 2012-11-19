package io;



public class CharCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("file.encoding", "iso8859-1");
		System.getProperties().list(System.out);
		
		String strChina = "中国";
		
		for(int i=0;i<strChina.length();i++){
			System.out.println(Integer.toHexString((int)strChina.charAt(i)));
			
		}
		
	
		try {
			//byte[] buf = strChina.getBytes("gb2312");
			byte[] buf = strChina.getBytes();
			for(int i=0;i<buf.length;i++){
				System.out.println(Integer.toHexString(buf[i]));
				//System.out.write(buf[i]);
			}
			
			for(int i=0;i<buf.length;i++){
				System.out.write(buf[i]);
			}
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}

/*
 4e2d
56fd
ffffffd6
ffffffd0
ffffffb9
fffffffa
中国

 *
 **/

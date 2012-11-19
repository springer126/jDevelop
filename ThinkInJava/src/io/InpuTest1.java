package io;

public class InpuTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = new Integer(args[0]).intValue();
		int h = Integer.parseInt(args[1]);
		for(int i=0;i<h;i++){
			//String s = null ;
			StringBuffer s = new StringBuffer();
			for(int j=0;j<w;j++)
				s.append("*");
			System.out.println(s);
		}
				
		String s ="s1";
		System.out.println(s.hashCode());
		//hashCode :3614
		//hashCode存储的正是当前变量引用的对象的地址,s指向"s1"的地址
		s+="+s2";
		System.out.println(s.hashCode());
		//hashCode :107709612
		//hashCode存储的正是当前变量引用的对象的地址,s指向"s1+s2"的地址
		
		StringBuffer sb = new StringBuffer();
		sb.append("sb1");
		System.out.println(sb.hashCode());
		//hashCode :14576877
		//hashCode存储的正是当前变量引用的对象的地址,sb指向"s1"的地址
		sb.append("sb2");
		System.out.println(sb.hashCode());
		//hashCode :14576877
		//hashCode（散列码）存储的正是当前变量引用的对象的地址,sb指向"s1+s2"对象的地址

	}

}

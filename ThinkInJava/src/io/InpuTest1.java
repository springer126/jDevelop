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
		//hashCode�洢�����ǵ�ǰ�������õĶ���ĵ�ַ,sָ��"s1"�ĵ�ַ
		s+="+s2";
		System.out.println(s.hashCode());
		//hashCode :107709612
		//hashCode�洢�����ǵ�ǰ�������õĶ���ĵ�ַ,sָ��"s1+s2"�ĵ�ַ
		
		StringBuffer sb = new StringBuffer();
		sb.append("sb1");
		System.out.println(sb.hashCode());
		//hashCode :14576877
		//hashCode�洢�����ǵ�ǰ�������õĶ���ĵ�ַ,sbָ��"s1"�ĵ�ַ
		sb.append("sb2");
		System.out.println(sb.hashCode());
		//hashCode :14576877
		//hashCode��ɢ���룩�洢�����ǵ�ǰ�������õĶ���ĵ�ַ,sbָ��"s1+s2"����ĵ�ַ

	}

}

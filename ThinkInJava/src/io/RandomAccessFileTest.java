package io;
/**
 * 
 * @author Administrator wenhui
 * �ṩ�ڶ��ļ����ʷ��� ֧��������ʷ�ʽ
 *
 */

import java.io.RandomAccessFile;
public class RandomAccessFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("����",23);//�������ĺ�����Ϊ0�������ַ����ĳ���Ϊ8 ���ܱ�֤д���ļ����ֽ�����һ����
		/**
		lisi : 0
		���� : 0
	    wangwu : 0

		 */
		
		Employee e2 = new Employee("lisi",279);//write����ֻ��ֻ��д��һ���ֽ�
		Employee e3 = new Employee("wangwu",25);
		
		
		try {
			RandomAccessFile file = new RandomAccessFile("employee.txt","rw");
			//file.write(e1.name.getBytes());
			file.writeChars(e1.name);
			//file.write(e1.age);
			file.writeInt(e1.age);
			file.writeChars(e2.name);//ÿ���ַ�ռ���������� ��*.txt�ļ���Unicode����
			file.writeInt(e2.age);
			file.writeChars(e3.name);
			file.writeInt(e3.age);
			file.close();
			
			
			//int len  = 0;
			String strName= "";
			//byte[] buf = new byte[Employee.LEN];
			
			RandomAccessFile raf = new RandomAccessFile("employee.txt","r");
			
			//raf.skipBytes(9);����д��4���ַ���ע��ı�skip���ֽ���
			raf.skipBytes(Employee.LEN*2+4);
			//len = raf.read(buf);
		    //strName = new String(buf,0,len);
		    //System.out.println(strName.trim()+" : "+raf.read());ע��ı�read����ΪreadInt
			
			for(int i=0;i<Employee.LEN;i++){
				strName+=raf.readChar();
			}
			System.out.println(strName.trim()+" : "+raf.readInt());
			
			
		    raf.seek(0);
		    //len = raf.read(buf);
		    //strName = new String(buf,0,len);
		    strName= "";
		    for(int i=0;i<Employee.LEN;i++){
				strName+=raf.readChar();
			}
		    System.out.println(strName.trim()+" : "+raf.readInt());
		    
		    raf.skipBytes(Employee.LEN*2+4);
		    //len = raf.read(buf);
		    //strName = new String(buf,0,len);
		    
		    strName= "";
		    for(int i=0;i<Employee.LEN;i++){
		    	
				strName+=raf.readChar();
			}
		    System.out.println(strName.trim()+" : "+raf.readInt());
		    raf.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}

/**
 * 
lisi : 24
zhangsan : 23
wangwu : 25

lisi : 279
���� : 23
wangwu : 25


 * */

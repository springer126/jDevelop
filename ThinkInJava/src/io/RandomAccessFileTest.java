package io;
/**
 * 
 * @author Administrator wenhui
 * 提供众多文件访问方法 支持随机访问方式
 *
 */

import java.io.RandomAccessFile;
public class RandomAccessFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("张三",23);//姓名中文后年龄为0？？？字符串的长度为8 不能保证写入文件的字节数是一样的
		/**
		lisi : 0
		张三 : 0
	    wangwu : 0

		 */
		
		Employee e2 = new Employee("lisi",279);//write方法只会只会写入一个字节
		Employee e3 = new Employee("wangwu",25);
		
		
		try {
			RandomAccessFile file = new RandomAccessFile("employee.txt","rw");
			//file.write(e1.name.getBytes());
			file.writeChars(e1.name);
			//file.write(e1.age);
			file.writeInt(e1.age);
			file.writeChars(e2.name);//每个字符占用两个编码 ，*.txt文件是Unicode编码
			file.writeInt(e2.age);
			file.writeChars(e3.name);
			file.writeInt(e3.age);
			file.close();
			
			
			//int len  = 0;
			String strName= "";
			//byte[] buf = new byte[Employee.LEN];
			
			RandomAccessFile raf = new RandomAccessFile("employee.txt","r");
			
			//raf.skipBytes(9);年龄写入4个字符后，注意改变skip的字节数
			raf.skipBytes(Employee.LEN*2+4);
			//len = raf.read(buf);
		    //strName = new String(buf,0,len);
		    //System.out.println(strName.trim()+" : "+raf.read());注意改变read方法为readInt
			
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
张三 : 23
wangwu : 25


 * */

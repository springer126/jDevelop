package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializableTest.txt"));
		Cat cat = new Cat();
		cat.setName("Lucy");
		cat.setAge(2);
		oos.writeObject(cat);
		/*
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SerializableTest.txt"));
		ois.readObject();
		ois.close();
		*/
		byte[] buf = new byte[1024];
		FileInputStream fis = new FileInputStream("SerializableTest.txt");
		int len = fis.read(buf);
		System.out.println(new String(buf,0,len,"gb2312"));

	}

}

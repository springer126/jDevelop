package io;

import java.io.*;


@SuppressWarnings("serial")
public class SerializableClass implements Serializable{
	
	String s = "hello";
	public void display(){
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		try{
			SerializableClass obj1 = new SerializableClass();
			SerializableClass obj = new SerializableClass();
			System.out.println("obj1:"+obj1);
			File fo = new File("OutObj");
			FileOutputStream fos  = new FileOutputStream(fo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.writeObject(obj);
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		
		
		try{
			SerializableClass obj2 = new SerializableClass();
			File fi = new File("OutObj");
			FileInputStream fis  = new FileInputStream(fi);
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (SerializableClass)ois.readObject();
			ois.close();
			System.out.println("obj2:"+obj2);
			obj2.display();
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

}


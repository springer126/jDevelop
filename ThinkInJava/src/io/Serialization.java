package io;

import java.io.*;

public class Serialization {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student stu1 = new Student(19, "zhangsan", 25, "chemistry");
		Student stu2 = new Student(20, "lisi", 23, "physics");
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(stu1);
		os.writeObject(stu2);
		os.close();
		
		FileInputStream ios = new FileInputStream("student.txt");
		ObjectInputStream is = new ObjectInputStream(ios);
		stu1 = (Student)is.readObject();
		stu2 = (Student)is.readObject();
		is.close();
		
		System.out.println("id:"+stu1.id);
		System.out.println("anme:"+stu1.name);
		System.out.println("age:"+stu1.age);
		System.out.println("department:"+stu1.department);
		
		System.out.println("id:"+stu2.id);
		System.out.println("anme:"+stu2.name);
		System.out.println("age:"+stu2.age);
		System.out.println("department:"+stu2.department);
		
	
		
	}

}

/*
 id:19
anme:zhangsan
age:25
department:chemistry
id:20
anme:lisi
age:23
department:physics

 */

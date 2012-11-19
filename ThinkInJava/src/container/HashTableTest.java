package container;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<MyKey, Integer> ht = new Hashtable<MyKey, Integer>();
		ht.put(new MyKey("����",18),new Integer(1));
		ht.put(new MyKey("����",19),new Integer(2));
		ht.put(new MyKey("����",11),new Integer(3));
		
		//ht.put(new MyKey("����",11),new Integer(4));
		//Ϊ�˳ɹ����ڹ�ϣ���д洢�ͻ�ȡ�����������Ķ������ʵ�� hashCode ������ equals ����
		
		Enumeration<MyKey> e = ht.keys();
		while(e.hasMoreElements()){
			 MyKey key = e.nextElement();
			 System.out.println(key.toString()+" :"+ht.get(key));
		}
		 System.out.println(ht.get(new MyKey("����",18)));
		 
		 Hashtable<String, Integer> ht1 = new Hashtable<String,Integer>();
		 ht1.put("k1",new Integer(1));
		 ht1.put("k2",new Integer(2));
		 ht1.put("k3",new Integer(3));
		 Enumeration<String> e1 = ht1.keys();
			while(e1.hasMoreElements()){
				 String key1 = e1.nextElement();
				 System.out.println(key1+" :"+ht1.get(key1));
			}
		 System.out.println(ht.get("k1"));
		 
		 
		   Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		   numbers.put(new String("one"), 1);
		   numbers.put(new String("two"), 2);
		   numbers.put(new String("three"), 3);

		   //Integer n = numbers.get("two");
		   Integer n = numbers.get(new String("two"));
		     if (n != null) {
		         System.out.println("two = " + n);
		     }
		     else
		    	 System.out.println("can not get");

	}

}

/**
����19 :2
����18 :1
����11 :4



����18 :1
����11 :3
����19 :2
null


����18 :1
����11 :3
����19 :2
null
k3 :3
k2 :2
k1 :1
null
 */

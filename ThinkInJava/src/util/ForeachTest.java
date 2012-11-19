package util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ForeachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("_");
		list.add("World!");
		for(String str:list)
			System.out.println(str);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		Vector<String> vector = new Vector<String>();
		vector.add("Hello");
		vector.add(",");
		vector.add("World!");
		Enumeration<String> enumeration = vector.elements(); 
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
		
		Day day = Day.MONDAY;
		System.out.println(day);
		
		List<Day> list1 = new ArrayList<Day>();
		list1.add(Day.FRIDAY);
		list1.add(Day.MONDAY);
		list1.add(Day.THURSDAY);
		list1.add(Day.TUEDAY);
		for(Day myday:list1)
			System.out.println(myday);
 
	}
	
	enum Day{
		MONDAY,TUEDAY,WENDESDAT,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	


}

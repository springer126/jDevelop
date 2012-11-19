package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		Iterator<Integer> iterator = array.iterator();
		while(iterator.hasNext()){
			Integer i = (Integer)iterator.next();
			System.out.println(i);
		}

	}

}

package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckList {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probableDogs){
		probableDogs.add(new Cat());
	} 
	public static void main(String[] args) {
	List<Dog> list1 = new ArrayList<Dog>();
	oldStyleMethod(list1);
	List<Dog> list2 = Collections.checkedList(
		new ArrayList<Dog>(),Dog.class	
		);
   try{
	   oldStyleMethod(list2);
	   //java.lang.ClassCastException: 
	   //Attempt to insert class generics.Cat 
	   //element into collection with
	   //element type class generics.Dog
	   
   }catch(Exception e){
	   System.out.println(e);
   }
	
   List<Pets> pets = Collections.checkedList(
		   new ArrayList<Pets>(), Pets.class);
   pets.add(new Cat());
   pets.add(new Dog());

	}

}

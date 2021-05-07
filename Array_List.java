package JavaList;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	
	public static void main(String[] args) {
		
		// This Array List Will only stores String Objects 
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Prajjwal");
		al.add("Singh");
		al.add("Is");
		al.add("A");
		al.add("web");
		al.add("Developer");
		
		//Printing first type of Generic ArrayList
		System.out.print("\n\n\t Generic<String> list "+al);
		
		
		// This list can contan any kind of data 
		ArrayList al1=new ArrayList();
		
		al1.add("Name");
		al1.add("Prajjwal");
		al1.add("Age");
		al1.add(23);
		al1.add("Exeperince");
		al1.add(1.8);
		al1.add("Experinced");
		al1.add(true);
		
		System.out.print("\n\n\t Non Generic List : "+al1);
		
		/* The same array List can also be like this(Below One)
		 * 
		 * 
		 * 
		ArrayList<Object> al1=new ArrayList<Object>();
		
		al1.add("Name");
		al1.add("Prajjwal");
		al1.add("Age");
		al1.add(23);
		al1.add("Exeperince");
		al1.add(1.8);
		al1.add("Experinced");
		al1.add(true);
		
		System.out.print("\n\n\t Non Generic<Object> List : "+al1);
		
		 * 
		 * 
		 */
		
		
		// Object get(int index)
		// Object set(int index, Object Data)
		// Object remove(int index)
		// Boolean contains(Object data) (true is exist else false)
		// int ArrayList.size()
		System.out.println("\n\n\t Get 'index 2' data : "+al1.get(2));
		System.out.print("\n\n\t Set 'Prajjwal's Age' at index 2 : "+al1.set(2, "Prajjwal's Age"));
		System.out.println("\n\t New Array Is : "+al1);
		
		System.out.println("\n\n\t Remove data from last element : "+al1.remove(al1.size()-1));
		System.out.println("\n\t New Array Is : "+al1);
		
		System.out.println("\n\n\t Is there 'Prajjwal' exist(Contains) in the ArrayList? --> "+al1.contains("Prajjwal"));
		
		System.out.println("\n\n Iterate Using For-Each Loop of Object typed values below :-\n");
		for(Object obj:al1) {
			
			System.out.print("\n\n "+obj);
		}
		
		
		// Iterator Using Object Type
		System.out.print("\n\n Iterate Using Iterator Interface below :- \n ");
		Iterator itr=al1.iterator();
		
		// We Can use no type Iteraor to it works fine 
		//Iterator<Object> itr=al1.iterator();
		
		while(itr.hasNext())
			System.out.print("\n\n\t => "+itr.next());
		
		
	}

}

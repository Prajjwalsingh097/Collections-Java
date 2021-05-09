package JavaSet;

import java.util.HashSet;
import java.util.Iterator;

public class Java_Set {
	public static void main(String []args){
		
		HashSet set=new HashSet();
		//HashSet<String> set=new HashSet<String>();  Only Store String data 
		
		
		set.add("Prajjwal");
		set.add("Prajjwal");
		set.add("Singh");
		set.add("Is");
		set.add("A");
		set.add("Software");
		set.add("Software");
		set.add("Engineer");
		set.add("With");
		set.add(1.8);
		set.add("Year");
		
		set.add("Experinec");
		set.add(28000+" salary");
		set.add("Salary");
		
		
		
		
		// Here data is not added as in indexing approach.
		// We got a hashCode for this 
		
		System.out.println("\n\n\t Set Data : "+set);
		// Output of the Set is :-
		// Set Data : [Prajjwal, A, Engineer, Singh, Is, Software]

		//1. Data is unique, no redundancy 
		//2. Data is unordered in output due to hashing 
		
		//Iterator 
		Iterator it=set.iterator();
		
		
		while(it.hasNext())
			System.out.print("\n\n\t -> "+it.next());
		
		System.out.println("\n\t Methods common for all lets check ");
		System.out.print("\n\t1. Set Contains('Is') ? : "+set.contains("Is"));
		
		System.out.print("\n\t2. Set Size             : "+set.size());
		
		System.out.print("\n\t3. Set Remove('Is') ?   : "+set.remove("Is"));
		
		System.out.print("\n\t4. Set Contains('Is') ? : "+set.contains("Is"));
		
		System.out.print("\n\t5. Set Data             : "+set);
		
		
		
	}

}

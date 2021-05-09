package JavaSet;

import java.util.TreeSet;
import java.util.Iterator;

public class Tree_Set {

	public static void main(String[] args) {
		
				TreeSet set=new TreeSet();
				
				set.add("Prajjwal");
				set.add("Prajjwal");
				set.add("Singh");
				set.add("Is");
				set.add("A");
				set.add("Software");
				set.add("Software");
				set.add("Engineer");
				set.add("With");
				set.add("Year");
				
				set.add("Experinec");
					
				
				
				
				// Here data is Sorted
				// TreeSet is bit slower in processing as compare to HashSet 
				// And same as HashSet the method and the way of implementation are same 
				
				System.out.println("\n\n\t Set Data : "+set);
				// Output of the Set is :-
				// Set Data : [A, Engineer, Experinec, Is, Prajjwal, Singh, Software, With, Year]


				//1. Data is unique, no redundancy 
				//2. Data is In Sorted order in output (Alphabetically ordered)
				
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

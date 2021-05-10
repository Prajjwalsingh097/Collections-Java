package JavaList;

import java.util.LinkedList;
import java.util.Iterator;


public class Linked_List {

	public static void main(String[] args) {
			LinkedList ll=new LinkedList();
			
			ll.add("Prajjwal");
			ll.add("Singh");
			ll.add("Is");
			ll.add("a");
			ll.add(0,"Software");
			
			//System.out.println("To get Type of the Linked List : "+ll.getClass());
			
			System.out.print("\n\n Linked List Data "+ll);
			System.out.print("\n\n Linked List Data "+ll.size());
			System.out.print("\n\n Linked List Data "+ll.contains("Is"));
			System.out.println("\n\n Last Element Nethod "+ll.getLast());	
			
			
			Iterator itr=ll.iterator();
			
			int count=0;
			
			// Same method using iterator 
			while(itr.hasNext() && count<ll.size()-1) {
				itr.next();
				System.out.println(++count);
			}
			
			System.out.print("Last Value : "+itr.next());
			
			
		
			
			
		
	}

}

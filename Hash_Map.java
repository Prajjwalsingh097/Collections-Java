package JavaHashMAP;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Hash_Map {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Integer data or Apart from Integer for Exit");
			
			try {
				int n=in.nextInt();
				al.add(n);
			}
			catch(Exception e) {
				break;
			}
			
			
		}
		System.out.println("\n\n\n\t Input Array List : "+al);
		
		
		// That You to learn 
		// Get count of every input data using O(n) OR O(1) Complexity using HashMap 
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		// It will Iterate every value of ArrayList 'al'
		for(Integer o:al) {
			
			if(hm.containsKey(o))
			{
				Integer temp=hm.get(o)+1;
				hm.put(o,temp);
			}
			else
			hm.put(o,1);
			
		}
		
		System.out.println("\n\n\t Get All Data Using O(1) Complexity \n\n\t Hash Map : "+hm);
		
		System.out.println("\n\n\t Get All Data Using O(n) Complexity \n\n\t Hash Map Below : ");
		
		System.out.println("\n\t KEY  \t VALUE");
		for(Integer i: hm.keySet()) {
			System.out.print("\n\t "+i+"   "+hm.get(i));
			
		}
		

	}

}

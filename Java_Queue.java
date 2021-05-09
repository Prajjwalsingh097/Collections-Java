package JavaQueue;

import java.util.PriorityQueue;


public class Java_Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queu=new PriorityQueue<Integer>();
		for(int i=10;i>=1;i--)
			queu.add(i);
			
		// So the insertion into the Queue is in this way 
		// Queue (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
		
		// Priority Queue Sorts the data for Us
		// Queue (Front) 1 2 3 4 5 6 7 8 9 10(Rear) | Sorted Queue
		
		// Peeking -> Obtaining THe head of the Queue
		
		System.out.print("\n\n\t Peek Value of Queue "+queu.peek());
		System.out.print("\n\n\t "+queu.poll());
		System.out.print("\n\n\t Peek Value of Queue "+queu.peek());
		System.out.println("\n\n The Size of the Queue is : "+queu.size());
		System.out.println("\n\n\t Queue ==> "+queu);

	}

}
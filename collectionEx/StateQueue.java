package collectionEx;

import java.util.LinkedList;
import java.util.Queue;

public class StateQueue 
{

	public static void main(String[] args) 
	{
		Queue<String> sq = new LinkedList<>();
		
		sq.add("UP");
		sq.add("Bihar");
		sq.add("Gujarat");
		sq.add("Kerala");
		sq.add("Assam");
		sq.add("Rajasthan");
		
		System.out.println("Queue for States: ");
		
		// loop for printing queue states
		for(String state:sq)
		{
			System.out.println(state);
		}
		
		// PEEK ELEMENT
		System.out.println("Peek Element: " + sq.peek());
		
		// Dequeuing the states
		System.out.println("Dequeue: "+ sq.poll());
	}

}

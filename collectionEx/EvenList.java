package collectionEx;

import java.util.ArrayList;

public class EvenList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		
		// Loop for value from 1 to 10
		for(int i = 1; i<= 10; i++)
		{
			l1.add(i);
		}
		
		int total = 0;
		
		for(int number : l1)
		{
			if(number % 2 == 0)
			{
				total += number;
			}
		}
		
		System.out.println("Total Of Even Numbers: " + total);
	}

}

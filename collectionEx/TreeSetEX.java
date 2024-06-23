package collectionEx;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEX 
{

	public static void main(String[] args) 
	{
		int i,no;
		TreeSet<Integer> tr = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		 for (i = 1; i <= 5; i++) 
		 {
	            System.out.println("Enter a number divisible by 5:");
	            while (true) 
	            {
	                no = sc.nextInt();
	                if (no % 5 == 0) 
	                {
	                    tr.add(no);
	                    break;
	                }
	                else 
	                {
	                    System.out.println("Invalid input. Enter a number that is divisible by 5:");
	                }
	            }
	        }

	        // Close the scanner class
	        sc.close();

	        // Printing the final TreeSet 
	        System.out.println("Numbers in the TreeSet (divisible by 5): " + tr);
	    }
	}

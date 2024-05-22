package region.personalinfo;
import region.countrystatepack.*;

public class DemoPerson 
{

	public static void main(String[] args) 
	{
		Country c1 = new Country("India");
		City ct1 = new City("Gandhinagar");
	
		Person pr = new Person("Hirva",c1,ct1);
		
		System.out.println(pr);
		
		

	}

}

package region.personalinfo;
import region.countrystatepack.*;

public class DemoPerson 
{

	public static void main(String[] args) 
	{
		Country c1 = new Country("India");
		City cty = new City("Gandhinagar");
	
		Person pn = new Person("Hirva",c1,cty,20,100000);
		
		System.out.println(pn);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calculateTax(pn);
		
		Country c2 = new Country();
		c2.setCname("India");
		
		City cty1 = new City();
		cty1.setCname("Ahmedabad");
		
		Person p1 = new Person();
		
		p1.setPname("Disha");
		p1.setC1(c2);
		p1.setCty(cty1);
		p1.setAge(31);
		p1.setSalary(78000);
		
		System.out.println(p1);	
		
		TaxCalculation tx = new TaxCalculation();
		tx.calculateTax(p1);
		
		
	}

}

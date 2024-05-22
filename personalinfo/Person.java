package region.personalinfo;
import region.countrystatepack.*;

public class Person 
{
	private String pname;
	private Country c1;
	private City ct1;
	
	public Person()
	{
		this.pname = "";
		this.c1 = new Country();
		this.ct1 = new City();
	}
	
	
	public Person(String pname, Country c1, City ct1)
	{
		this.pname = pname;
		this.c1 = c1;
		this.ct1 = ct1;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public Country getC1() 
	{
		return c1;
	}

	public void setC1(Country c1) 
	{
		this.c1 = c1;
	}

	public City getCt1() 
	{
		return ct1;
	}

	public void setCt1(City ct1) 
	{
		this.ct1 = ct1;
	}

	@Override
	public String toString() 
	{
		return "Person [pname=" + pname + ", c1=" + c1 + ", ct1=" + ct1 + "]";
	}
}
	
	






	
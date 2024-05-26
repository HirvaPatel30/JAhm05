package region.personalinfo;
import region.countrystatepack.*;

public class Person 
{

		private String pname;
		private Country c1;
		private City cty;
		private int age;
		private int salary;
		
		public Person()
		{
			
		}
		
		public Person(String pname, Country c1, City cty, int age, int salary) 
		{
			this.pname = pname;
			this.c1 = c1;
			this.cty = cty;
			this.age = age;
			this.salary = salary;
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

		public City getCty() 
		{
			return cty;
		}

		public void setCty(City cty) 
		{
			this.cty = cty;
		}

		public int getAge() 
		{
			return age;
		}

		public void setAge(int age) 
		{
			this.age = age;
		}

		public int getSalary() 
		{
			return salary;
		}

		public void setSalary(int salary) 
		{
			this.salary = salary;
		}

		@Override
		public String toString() 
		{
			return "Person [pname=" + pname + ", c1=" + c1 + ", cty=" + cty + ", age=" + age + ", salary=" + salary + "]";
		}
		
	}

	






	
package staticEx;

public class MainStatic {

	public static void main(String[] args) 
	{
		//se.welcome static is not depend on an object
		StaticExample se = new StaticExample();
		System.out.println(se);
		
		StaticExample se1 = new StaticExample();
		System.out.println(se1);
		
		// static depends on class
		// we can call it by using class name
		System.out.println(StaticExample.welcome);
		
		
	}

}

package staticEx;

public class StaticExample 
{
	static int cnt = 0;
	int no = 0;
	static String welcome = "Let us learn coding!!";
	
	public StaticExample()
	{
		cnt++;
		no++;
	}

	@Override
	public String toString() {
		return "Static Total = " + cnt + " , " +  "Instance No = " + no;
	}
	
}

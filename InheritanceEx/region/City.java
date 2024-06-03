package region;

public class City extends State  
{
	private String ctname;

	public String getCtname()
	{
		return ctname;
	}
	
	public void setCtname(String ctname)
	{
		this.ctname = ctname;
	}
	
	@Override
	public String toString()
	{
		
		return "Country = " + getCname() + " , " + "State = " + getSname() + " , " + "City = " + ctname;
	}
	
}

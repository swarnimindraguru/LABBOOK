package Lab9;

public class IncrementRunnable implements Runnable {

	private String name;
	public IncrementRunnable(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("name "+name);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

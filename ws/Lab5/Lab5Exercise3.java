package Lab5;

public class Lab5Exercise3 {
	
	public static void main(String []args)
	{
	PrimeRange primeRange=new PrimeRange();
	primeRange.execute();
	}
	
	public void execute()
	{
		int k=20;
		int i=2;
		while(i<=k)
		{
			if(prime(i))
			{
			System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public boolean prime(int n)
	{
		boolean flag=true;
		
		if(n==2)
			return true;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				return true;
			else
				return false;
		}
	}
}

package Lab5;

public class Lab5Exercise2 {

	public static void main(String[] args) {
		
		Fibonaci fib=new Fibonaci();
		fib.execute();

	}
	
	public void execute()
	{
		System.out.println(fibRecursive(10));
		System.out.println(fib(10));
	}

	public int fibRecursive(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
			return (fibRecursive(n-1)+fibRecursive(n-2));
	}
	
	public int fib(int n)
	{
		int a=1;
		int b=1;
		
		int i=0;
		int k=0;
		while(i<n)
		{
			k=a;
			b=a+b;
			a=b-a;
			i++;
		}
		return k;
	}
}

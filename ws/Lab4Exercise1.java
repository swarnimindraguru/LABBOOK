package Lab4;

public class Lab4Exercise1 {
	public static void main(String [] args)
	{
		Cubes cubes=new Cubes();
		System.out.println(cubes.cubesOfDigit(555));
	}
	
	public int cubesOfDigit(int number)
	{
		int rem=0;
		int sum=0;
		while(number>0)
		{
			rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
			
		}
		return sum;
		
	}
	

}

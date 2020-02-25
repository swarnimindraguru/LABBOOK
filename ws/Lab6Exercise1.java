package demo;
import java.util.*;
public class Lab6Exercise1 {

	public static void main(String []args)
	{
		
		String s=new String();
		s="1 2 3 4 5 6 7";
		int sum=0;
	
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			String tokens=st.nextToken();
			sum=sum+Integer.parseInt(tokens);
			System.out.println(tokens);
		}
		System.out.println("The sum of integer is :"+sum);
	}
	
}

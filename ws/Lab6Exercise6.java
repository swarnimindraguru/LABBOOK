

import java.util.*;

public class Lab6Exercise6 {

	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the String");
		String x=in.nextLine();
		display(x);
	}

	public static void display(String x) {
		int ch=0;int l=1;int w=0;
		for (int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				ch=ch+1;
			}
			else
			{
				w=w+1;
			}
			if(x.charAt(i)=='\n'){
				l=l+1;
			}
		}
		System.out.print("Number of characters="+ch);
		System.out.print("Number of words="+(w+1));
		System.out.print("Number of lines="+l);
		
	}
}

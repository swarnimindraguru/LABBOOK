package Lab5;

import java.util.Scanner;

public class ValidAge {

	public static void main(String[] args) {
		
		ValidAge validAge=new ValidAge();
		validAge.execute();

	}
	public void execute()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName=scan.nextLine();
		
		System.out.println("Enter Age :");
		int age=scan.nextInt();
		
		display(firstName,age);
		
	}
	public void display(String firstName,int age)
	{
		try
		{
			if(firstName.equals("") || age<15)
			{
				InvalidAgeException invalidAgeException=new InvalidAgeException("Invalid Age!");
				 throw invalidAgeException;
			}
			else
				System.out.println("First Name: "+firstName+" Age is: "+age);
		}
		catch(InvalidAgeException ex)
		{
			ex.printStackTrace();	
		}
	}

}

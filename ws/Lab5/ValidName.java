package Lab5;

import java.util.Scanner;

public class ValidName {

	public static void main(String[] args) {
		
		ValidName validName=new ValidName();
		validName.execute();

	}
	
	public void execute()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName=scan.nextLine();
		System.out.println("Enter Last"
				+ ""
				+ " Name:");
		String lastName=scan.nextLine();
		
		display(firstName,lastName);
		
	}
	public void display(String firstName,String lastName)
	{
		try
		{
			if(firstName.equals("") || lastName.equals(""))
			{
				InvalidNameException invalidNameException=new InvalidNameException("Invalid Name!");
				 throw invalidNameException;
			}
			else
				System.out.println("First Name: "+firstName+" Last Name: "+lastName);
		}
		catch(InvalidNameException ex)
		{
			ex.printStackTrace();	
		}
	}

}

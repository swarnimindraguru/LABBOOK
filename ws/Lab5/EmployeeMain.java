package Lab5;

import com.cg.eis.exception.EmployeeException;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeMain employeeMain=new EmployeeMain();
		employeeMain.execute();

	}
	
	public void execute()
	{
		Employee emp1=new Employee("Swarnim",50000.43);
		Employee emp2=new Employee("Aman",1000.0);
		
		Employee [] empArray=new Employee[2];
		empArray[0]=emp1;
		empArray[1]=emp2;
		
		check(empArray);
	}
	public void check(Employee []empArray)
	{
		try
		{
			for(int i=0;i<empArray.length;i++)
			{
				if(empArray[i].salary<3000.0)
				{
					EmployeeException employeeException=new EmployeeException("Salary Less Than 3000 Not Allowed!");
					throw employeeException;
				}
				else
				{
					System.out.println("Name is:"+empArray[i].getName()+" Salary is "+empArray[i].getSalary());
				}
			}
		}
		catch(EmployeeException ex)
		{
			ex.printStackTrace();
		}
		
	}

}

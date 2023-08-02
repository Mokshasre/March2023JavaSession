package classobjects;

public class EmployeeMarks {
	
	public int employeeMarks(String empName)
	{
		int marks = -1;
		if(empName.equals("Neelam"))
		{
			marks=90;
			
		
		}
		else if(empName.equals("Tom"))
		{
			marks=95;
			
		
		}
		else if(empName.equals("Mitaj"))
		{
			marks=80;
			
		
		}
		else if(empName.equals("Raju"))
		{
			marks=10;
			
		
		}
		else
		{
			
			System.out.println("emp name is not found....." + empName);
			
		}
		
		
		
		return marks;
		
		
		
	}

}

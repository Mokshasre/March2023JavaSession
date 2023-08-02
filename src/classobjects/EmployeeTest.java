package classobjects;

public class EmployeeTest {
	
	public int getEmployeeMarks(String empName)
	{
		System.out.println("Getting Employee Marks -----" + empName);
		int marks = -1;//we are writing these since if emp not found it returns -1;
		switch (empName) 
		
		{
		case "Neelam": 
			marks = 90; // m-- this also can return and atlast we can return
			//return 90;
			break;
		
			
		case "Mitaj": 
			marks = 95; //-- this also can return and atlast we can return
			//return 95;
			break;
		
		case "Ravi": 
			marks = 80; //-- this also can return and atlast we can return
			//return 80;
			break;
		
		case "Naveen": 
			marks = 70; //-- this also can return and atlast we can return
			//return 70;
			break;
		
		case "padma": 
			marks = 10; //-- this also can return and atlast we can return
			//return 10;
			break;	
		
		default:
			System.out.println("Emp name not found....." + empName);
			//return -1;
			break;
		}
		
		return marks;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeTest e1 = new EmployeeTest();
		
		int m1 = e1.getEmployeeMarks("Ravi");
		
		System.out.println(m1);
		
		if(m1>=0)
		{
			
			System.out.println("print the marksheet");
		}
		
	}

}

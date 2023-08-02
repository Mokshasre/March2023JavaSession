package classobjects;

public class Customersreturn {
	
	//instance vars//class var
	String name;
	int age;
	//noreturn no parameter
	public void test()
	{
		
		System.out.println("test method");
	}
	
	
	//with retrun and no param
	public String getTrainerName() {
		
		System.out.println("getting the trainer name");
		
		String name = "naveen";
		return name;
		
	}
	//with retrun and no param
	public Short getNumber() {
		System.out.println("getting number");
		return 900;
	}
	public int  sum() {
		System.out.println("Sum mthod");
		int a = 20,b = 3,c;
		c= a+b;
		return c;
	}
		//with return and with param
		
		public int calAdd(int a,int b)
		{
			int sum = a+b;
			return sum;
			
		}
		
		//get total marks
		
		public double getTotakMarks(double score,int handwritingscore,int attendscore)
		{
			System.out.println("Calculating Marks");
			double finalScore = score+handwritingscore+attendscore;
			
			return finalScore;
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customersreturn cusObj = new Customersreturn();
		cusObj.name = "John";
		cusObj.age = 30 ;
		System.out.println("Calling Class varaiable with obj refernce" + " = " + cusObj.name);
		
		System.out.println("--------------------");
		//calling method and string in string
		String trName = cusObj.getTrainerName();
		System.out.println(trName);
		
		if(trName.equals("Raju"))
		{
			System.out.println("Pass");
			
		}
		else
			System.out.println("Fail");
		System.out.println("--------------------");
		
		cusObj.test();
		System.out.println("--------------------");
	int num =	cusObj.getNumber();//if there is no print statement in method it wont return anything
		System.out.println(num);
		System.out.println("--------------------");
		
		System.out.println(cusObj.calAdd(2, 3));
		
	
		System.out.println(	cusObj.sum());//As soon as method is called -print stamets n if its returning something it comes
			
		System.out.println("--------------------");
		
		double finScore = cusObj.getTotakMarks(59, 5, 5);
		
		System.out.println(finScore);
		
		if(finScore >= 90)
		{
			System.out.println("Got VGood Marks");
		}
		else if (finScore >= 80)
		{
			System.out.println("Got Good Marks");
		}
		else if (finScore >= 70)
		{
			System.out.println("Got Avg Marks");
		}
		else
				
			{
				System.out.println("Need to Improve");
			}
		
		// calling  EmployeeMarks class from another file
		System.out.println("---------calling  EmployeeMarks class from another file-----------");
		EmployeeMarks em = new  EmployeeMarks();
		int m1 = em.employeeMarks("tina");
		System.out.println(m1);
		
		}
		
		}

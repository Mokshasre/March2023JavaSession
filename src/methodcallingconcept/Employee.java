package methodcallingconcept;
import classobjects.EmployeeMarks;

public class Employee {
	
	public void m1()
	{
		System.out.println("m1 method");
	}

	public void m2()
	{
		System.out.println("m2 method");
	}
	public void m3()
	
	{
		t1();
		System.out.println("m3 method");
	}
	
	public static void t1()
	{
		//t3();//we can directly static methods in static
		System.out.println("t1 method");
	}
	
	public static void t2()
	
	{
		Employee e1 = new  Employee();
		e1.m1();
		System.out.println("t2 method");
	}
	public static void t3()
	
	{
		t2();
		System.out.println("t3 method");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new  Employee();
		
		e1.m1();
		e1.m2();
		//other class object creation
		Browser browobj = new Browser();
		//brow.b1();
		EmployeeMarks obj1 = new EmployeeMarks();//calking otehr package class n created obj n called method
		int mar = obj1.employeeMarks("Tom");//
		System.out.println(mar);
		
		System.out.println("--------------");
		//With classname static methods
		Employee.t1();
		
		Employee.t3();
		System.out.println("--------------");
		e1.m3();//called static method internall n non static
		System.out.println("--------------");
		Employee.t2();
		
		System.out.println("--------------");
		//calling otherclASS methods
		
		browobj.b2();
		Browser.p1();//this is static method in other class
		
	}

}

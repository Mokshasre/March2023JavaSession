package methodcallingconcept;

public class Browser {
	
	public void b1()
	{
		System.out.println("b1 method");
		b2();
		Employee.t1();//static method in other class
	}

	public void b2()
	{
		System.out.println("b2 method");
		p1();
	}
	

	public static void p1()
	{
		System.out.println("p1 method");
		Employee emp = new  Employee();
		emp.m1();//but this is not recommened n its very costly interms of obj creation
		//b2();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Browser browobj = new Browser();
//		
//		browobj.b2();
//	}
	

}

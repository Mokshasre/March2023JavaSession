package ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() 
	{
		System.out.println("m2 method");
		try {
			m3();
			}
			catch (ArithmeticException e)
			{
				System.out.println("AE is Coming");
				e.printStackTrace();
			}
	}
	public void m3() throws ArithmeticException
	{
		System.out.println("m3 method");
			int i =9/0;
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		//below is not good practise ...main shd be caller methid
//		try {
//		obj.m1();
//		}
//		catch (ArithmeticException e)
//		{
//			
//			System.out.println("AE is Coming");
//			e.printStackTrace();
//		}
		System.out.println("bye");

	}

}

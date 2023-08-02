package classobjects;

public class NumberTest {
	
	
	public int addition(int a, int b)
	{
		int sum = a+b;
		return sum;
		
	}
	public int subtract(int a, int b)
	{
		int sub = a-b;
		return sub;
		
	}
	public int mutiply(int a, int b)
	{
		int mul = a*b;
		return mul;
		
	}
	public int division(int a, int b)
	{
		int div = a/b;
		return div;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberTest nt = new NumberTest();
		
		int add = nt.addition(20, 30);
		
		int sub1 = nt.subtract(50, 10);
		
		int mult = nt.mutiply(5, 4);
		
		int division = nt.division(20, 5);
		
		System.out.println("Addition of 2 nos " + add);
		System.out.println("Subtraction of 2 nos " + sub1);
		System.out.println("Multiplication of 2 nos " + mult);
		System.out.println("Division of 2 nos " + division);
		

	}

}

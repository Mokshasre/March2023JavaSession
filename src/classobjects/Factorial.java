package classobjects;

public class Factorial {
	
	//Factorial formulae - n!=n*(n-1)
	
	public int calcFactorial(int number)
	{
		int factorial =1;
		// without recursive
		if(number < 0)
		{
			System.out.println("Cant find the factorial of given number");
		}
		else if(number <=1)
		{
			System.out.println("factorial of 0 and 1 is always" + factorial);
		}
		else {
			
			for(int i = 2; i<=number ; i++) // 4! = 4*3*2*1 in decrementing format it hs to loop so we do --
			{
				
				factorial = factorial * i;	
				
			}
		}
		return factorial;
		
	//2. recursive is calling itself
		//public int calcFactorial(int number)
//		//if(num ==0)//4
//		
//			return 1;
//			else 
//				return(num * fact(num-1)); // 4*fact(3)//3*fact(2) //2*(1)//1*fact(0)
//		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial fact = new Factorial();
		int result = fact.calcFactorial(0);
		
		System.out.println(result);

	}

}

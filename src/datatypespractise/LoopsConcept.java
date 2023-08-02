package datatypespractise;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
//				for(int m=1; m<=100; m++)
//				{
//					if(m % 5 ==0)
//					{
//						System.out.println(m);
//					}	
//				
//				}
		//using do while
		
//		int m=1;
//		do
//		{
//			if (m % 5 == 0)
//			{
//				System.out.println(m);
//			}
//			m++;
//			
//		}while(m<=100);
		
		//while  lopp for odd or even numbers
		
		int e = 1;
		
		while(e<=100)
			
		{
			if (e % 2 ==0)
			{
				System.out.println(e + " is even number");
			}
			else 
			{
				System.out.println(e + " is odd number");
			}
		
			e++;
		}
		
		//while loop
		
//		int i =1;
//		
//		while(i<=10)
//		{
//			if(i == 6)
//			{
//				System.out.println("hi");
//				break;
//			}
//			if(i == 5)
//			{
//				System.out.println("hi");
//				break;
//			}
//			if(i == 3)
//			{
//				System.out.println("hi");
//				break;
//			}
//			System.out.println(i);
//			
//			i++;
//		}
		
		//For LOOP
		
		//int i = 0;
		
//		for(int i =1; i<=5; i++)
//		{
//			System.out.println("I am Batman");
//		}
		
		// by using while loop to print like I am Batman 1....etc
		
		int i =1;
		while (i<=10)
		{
			System.out.println("I am Batman" + " " + i);
			i++;
		}
		System.out.println("-------------------------");
		
		//-------------------WAP to print 10 to 1 using for, while and do-while loop
		
//		int n =10;
//		while (n>=1)
//		{
//			System.out.println(n);
//			n--;
//		}
		
	//----------------using do while--------
		
		int n =10;
		do
		{
			System.out.println(n);
			n--;
		}
		while (n>=1);
		
		//---------rite a program in Java to print "Hello World" ten times using while loop
		int p =1;
		while (p<=10)
	{			System.out.println("Hello World" + p);
		p++;
		}
		
		
		
		
		

	}

}

package OOP_Inheritance;

public class Car extends Vehicle {
	
	//car is having 2 child classes i.e BMW,Audi
	
	public  void start()
	{
		System.out.println("car-----Start");
	}
	public void stop()
	{
		System.out.println("car-----stop");
	}
	public void refuel()
	{
		System.out.println("car-----refuel");
	}
	//
	@Override
	public void engine()
	{
		System.out.println("Car---- engine");
	}
	
	public static void billing()
	{
		
		System.out.println("Car billing ");
	}
	
	private static  void test()
	{
		System.out.println("CAr testing ");
		
	}
	public void carTesting() {
		
		test();
	}
	
	public final void power()
	{
		System.out.println("car-----power");
	}
	public final static void ABS() 
	{
		System.out.println("car-----ABS");
	}

}

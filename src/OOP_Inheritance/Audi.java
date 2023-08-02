package OOP_Inheritance;

public class Audi extends Car {
	
	//car is having 2 child classes i.e BMW,Audi
	
	@Override
	public void start()
	{
		System.out.println("Audi.............start");
	}
	//individual method of audi
	public void theftSafety()
	{
		System.out.println("Audi.............theftSafety");
	}
	private void testing()
	{
		System.out.println("Audi testing ");
		
	}
	
	

}

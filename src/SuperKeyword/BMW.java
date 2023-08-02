package SuperKeyword;

public class BMW extends Car {
	
	int min_speed = 200;
	
	public BMW()
	{
		
		super(20);//car default constructor is called
		//super();//this is anot allowed super shd be in first line 
		//this(10);//this is not alowed
		System.out.println("BMW default constructor");
	
	}
	public BMW(int i)
	{
		super();
		System.out.println("BMW constructor" + i);
	}
	
	
	public void displaySpeed()
	{
		
	    System.out.println(min_speed);//200
		System.out.println(super.min_speed);//100//50
	}
	public void speed() {
		 
		 System.out.println("BMW speed");
		 super.speed();
		 System.out.println(super.min_speed);
		 super.testing();
		 //Car.testing();
	 }

}

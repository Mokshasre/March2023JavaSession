package constructorconcept;

public class Car extends User {
	
	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		//super("testuser",56);//parent class default constructor is called
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("Car constructor with 3 param");
	}
	
	//default constructor for the Car class that sets the make, model, and year 
	public Car() {
		this("Unknown","A2021",2022);
		System.out.println("child class default Car const");
		
		
	}
	public Car(String model, int year) {
		//super();
		this.model = model;
		this.year = year;
		User u1 = new User();
		u1.age = 29;
		System.out.println(u1.age);
				
	}
	
	public static void main(String a[])
	{
		Car c1 = new Car();
		
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.year);
		
		System.out.println("-------Another instance of car is created------------ ");
		
		Car c2 = new Car("Hyundai","XCVFR",2022);
		
		System.out.println(c2.make + "," + c2.model + "," + c2.year);
		
		System.out.println("-------Another instance of car is created------------ ");
		
		Car c3 = new Car("Subaru",2023);
		
		System.out.println(c3.make + "," + c3.model + "," + c3.year);
	}


	
	
	
	

}

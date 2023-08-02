package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		
		b.stop();//inherited
		b.refuel();//inherited
		b.start();//overriding
		b.autoParking();//individual method of BMW
		
		
		b.engine();//grandchild is accessing the grantparent method
		//grandchild is accessing the 5 levels above grantparent method
		b.generic();
		
	//static methods calling classname with	
	BMW.billing();
	Car.billing();
	
	b.power();//inherited
	//b.theftSafety();//sibilings cant inherit methods 
	b.carTesting();


	
	System.out.println("------Audi class call---");	
	Audi au = new Audi();
	au.stop();//inherited
	au.start();//overridden
	au.theftSafety();//individual method
	au.refuel();//inherited
	//billing method is static in car so the childcan call with classname
	Audi.billing();
	au.power();
	Audi.ABS();
	
	
		
	System.out.println("------parent class call---");	
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		c.engine();//child is accessing the parent
		c.generic();//grand child is accessing the 4 levels above grand parent
		
		
		System.out.println("------Top casting---");	
		new BMW(); // this object without reference name and its eligible for Garbage collector which is no name
		//child class object can be referred by parent class of variable
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();//
		//c1.autoParking();its not possible 
		System.out.println("------Top casting with grand parents---");		
		//child class object refred by grand parent class ref varaible
		Vehicle v = new BMW();
		//v.start(); its not possible since parent cant access teh child methods -ref check is failed
		v.engine();
		
		
		
		Automobile a = new BMW();
		a.autoElectric();
		a.generic();
		//down casting
		//parent class obj can be refered by child class ref variable using down casting
		//BMW b1 = (BMW) new Car();
		//b1.start();//classcast exception

	}

}

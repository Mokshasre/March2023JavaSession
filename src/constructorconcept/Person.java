package constructorconcept;

public class Person {
	
	String name;
	static String collegeName;
	
public Person(String name,String collegeName) {
	
		this("Raju");//to call constructor in another constructor
		this.name = name;
		Person.collegeName = collegeName;
	}

	public Person(String name) {
		
		this.name = name;
		System.out.println(this.name);
		testMethod();//constructor call other methods
		User U = new User("otherclass",45);//another class constructor
		//U.city = "Delhi";
		System.out.println(U.age);
	}
	
	public static void testMethod()
	{
		System.out.println("Normal method called");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("naveen", "ABCD");
		System.out.println(collegeName);//since its static we can directly also with variable
		System.out.println(p1.name);
		Person p2 = new Person("tom");
		//------------------
		System.out.println(p2.name);
		System.out.println(p2.collegeName);//we did not supply ABCS in constructor still we get since in CMA allocation
		//for static varaible the value is ABCD in these case so whatever refernce it takes teh same vale
		Person.testMethod();
		
	

	}

}

package constructorconcept;

public class User {
	
	String name;
	int age;
	double salary;
	String city;
	char gender;
	boolean isActive;
	
	public User()
	{
		
		System.out.println("default user constructer with 0  param");
	}
	
	public User(String name1,int age1)
	{
		this.name = name1;//this will call global/class varaiables
		this.age = age1;
		System.out.println("constructor with 2 param");
		
	}
	public User(String name1,int age1,String city)
	{
		this.name = name1;//this will call global/class varaiables
		this.age = age1;
		this.city = city;
		
	}

	public User(double salary, String city, char gender, boolean isActive) {
		
		this.salary = salary;
		this.city = city;
		this.gender = gender;
		this.isActive = isActive;
	}

	private User(int age, String name) {
		
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User("Tom",30);
		User u2 = new User("raju",30,"LA");
		User u3 = new User(25,"sravs");
	
		System.out.println(u3.name + " " + u3.age);
		System.out.println(u1.name + " " + u1.age);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
	}

}

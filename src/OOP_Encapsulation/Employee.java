package OOP_Encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	private void calculateShareAmount(int fee) {
		int i =10;
		amount = i+fee;
		
	}
	//to call private method we call the same in public
	public int getAmount()
	{
		int fee = 0;
		calculateShareAmount(fee);
		return amount;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee e1 = new Employee();
//		e1.setName("Srav");
//		e1.setAge(45);
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//	}
}

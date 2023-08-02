package classobjects;

public class MethodOverloading {
	//same method n diff parameters 
	public void search() {
		
		System.out.println("No parameters passed");
		
	}
	public void search(String name)
	{
		
		System.out.println("Single parameters passed");
	}
	public void search(String name,int price)
	{
		System.out.println("parameters are string and int are  " + name + "&" + price);
	}
	public void search(int price,String name)
	{
		System.out.println("parameters are int and string are " + price + "&" + name);
	}
	public void doPayment(String cc,int cvv,int otp)
	{
		System.out.println("parameters are int cc, cvv,otp ");
	}
	//examples of method overloading
	//uber,payment

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.search(5, "sravs");
		obj.search("prabha", 8);
		obj.doPayment("test", 143, 000);

	}

}

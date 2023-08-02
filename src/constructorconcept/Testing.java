package constructorconcept;

public class Testing {
	
	public static void getNumber()
	{
		
		
	}
	public static void getBrowser()
	{
		
		System.out.println("static method called");
	}
	private Testing()
	{
		System.out.println("private constructor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t1 = new  Testing();
		Testing.getBrowser();

	}

}

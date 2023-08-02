package ExceptionHandling;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="naveen";
		
		if(name == "chrome")
		{
			
			System.out.println("launch the chrome");
		}
		else
		{
			System.out.println("browser not found");
			throw new FrameWorkException("browser not found");
		}
		
   System.out.println("enter the url");
	}

}

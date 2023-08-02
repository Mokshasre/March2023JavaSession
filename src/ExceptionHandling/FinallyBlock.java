package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ABC");
		
		try {
			int i =9/0;
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("AE is Coming");
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("Im in finally block");
		}
		
	}

}

package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser =null;
		
		if(browser == null)
		{
			
			try {
				throw new Exception("NO BROWSER EXCEPTION");
					
				
			} catch (Exception e) {
				System.out.println("browser not found please pass right browser");
				e.printStackTrace();
				// TODO: handle exception
			}
		}

	}

}

package datatypespractise;

public class ExampleIFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "firefox";
		if(browser.equals("Chrome"))
		{
			System.out.println("Launch Chrome");
		}
		else if (browser.equals("safari")) {
			System.out.println("Launch safari");
			
		} 
		else if (browser.equals("edge")) {
			System.out.println("Launch edge");
			
		} 
		else if (browser.equals("firefox")) {
			System.out.println("Launch firefox");
			
		} 
		
		
		else {
			System.out.println("please pass the right browser" + browser);

		}
		
		
		

	}

}

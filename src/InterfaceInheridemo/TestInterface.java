package InterfaceInheridemo;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver cd = new ChromeDriver();
		
		RemoteWebDriver rd = new  RemoteWebDriver();
		
		rd.remote = "test";
		rd.d = 10.00;
		rd.testmethod();
		rd.remoteMethod();
		
		
		

	}

}

package InterfaceInheridemo;

public class RemoteWebDriver implements WebDriver, SearchContext {
	
	String remote;
	private int num;
	protected Double d;
	

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("findEle method");
		num=10;
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
	public void testmethod()
	{
		
		System.out.println("Remote WD meth");
	}
	protected void remoteMethod()
	{
		
		System.out.println("Remote protected WD meth22");
	}
	private void primethod()
	{
		System.out.println("Remote private WD meth22");
	}
	

}
